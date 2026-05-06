package br.com.douglas.domain;

import org.junit.jupiter.api.Test;

import br.com.douglas.domain.Cliente;
import br.com.douglas.services.ClienteService;
import br.com.douglas.services.IClienteService;


public class ClienteTest {

    private IClienteService clienteService;

    public ClienteTest() {
        
        clienteService = new ClienteService();
    }

    @Test
    public void pesquisarCliente() {
        Cliente cliente = new Cliente();
        cliente.setCpf(123456789L);
        cliente.setNome("Douglas");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setNumero(123);
        cliente.setTel(21999999999L);

        clienteService.salvar(cliente);

        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);

    }

    public IClienteService getClienteService() {
        return clienteService;
    }

    public void setClienteService(IClienteService clienteService) {
        this.clienteService = clienteService;
    }

}
