package br.com.douglas.domain;

import java.util.Collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.douglas.dao.ClienteDAO;
import br.com.douglas.dao.IClienteDAO;
import br.com.douglas.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author douglas
 */
public class ClienteDAOTest {

    private IClienteDAO clienteDao;

    private Cliente cliente;

    public ClienteDAOTest() {
        clienteDao = new ClienteDAO();
    }

    @BeforeEach
    public void init() throws TipoChaveNaoEncontradaException {
        cliente = new Cliente();
        cliente.setCpf(12312312312L);
        cliente.setNome("Rodrigo");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setEstado("SP");
        cliente.setNumero(10);
        cliente.setTel(1199999999L);
        clienteDao.cadastrar(cliente);
    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
        Assertions.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setCpf(56565656565L);
        Boolean retorno = clienteDao.cadastrar(cliente);
        Assertions.assertTrue(retorno);
    }

    @Test
    public void excluirCliente() {
        clienteDao.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("Rodrigo Pires");
        clienteDao.alterar(cliente);
        Assertions.assertEquals("Rodrigo Pires", cliente.getNome());
    }

    @Test
    public void buscarTodos() throws TipoChaveNaoEncontradaException {
        // Cadastra um segundo cliente para ter 2 no mapa
        Cliente cliente2 = new Cliente();
        cliente2.setCpf(99999999999L);
        cliente2.setNome("Maria");
        clienteDao.cadastrar(cliente2);

        Collection<Cliente> list = clienteDao.buscarTodos();
        Assertions.assertNotNull(list);
        Assertions.assertTrue(list.size() >= 1);
    }

}