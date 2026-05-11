package br.com.douglas.domain;

import java.math.BigDecimal;
import java.util.Collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.douglas.dao.IProdutoDAO;
import br.com.douglas.dao.ProdutoDAO;
import br.com.douglas.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author rodrigo.pires
 */
public class ProdutoDAOTest {

    private IProdutoDAO produtoDao;

    private Produto produto;

    public ProdutoDAOTest() {
        produtoDao = new ProdutoDAO();
    }

    @BeforeEach
    public void init() throws TipoChaveNaoEncontradaException {
        produto = new Produto();
        produto.setCodigo("A1");
        produto.setDescricao("Produto 1");
        produto.setNome("Produto 1");
        produto.setValor(BigDecimal.TEN);
        produtoDao.cadastrar(produto);
    }

    @Test
    public void pesquisar() {
        Produto produto = this.produtoDao.consultar(this.produto.getCodigo());
        Assertions.assertNotNull(produto);
    }

    @Test
    public void salvar() throws TipoChaveNaoEncontradaException {
        produto.setCodigo("A2");
        Boolean retorno = produtoDao.cadastrar(produto);
        Assertions.assertTrue(retorno);
    }

    @Test
    public void excluir() {
        produtoDao.excluir(produto.getCodigo());
    }

    @Test
    public void alterarProduto() throws TipoChaveNaoEncontradaException {
        produto.setNome("Produto Alterado");
        produtoDao.alterar(produto);
        Assertions.assertEquals("Produto Alterado", produto.getNome());
    }

    @Test
    public void buscarTodos() throws TipoChaveNaoEncontradaException {
        // Cadastra um segundo produto para ter 2 no mapa
        Produto produto2 = new Produto();
        produto2.setCodigo("B1");
        produto2.setNome("Produto 2");
        produto2.setValor(BigDecimal.ONE);
        produtoDao.cadastrar(produto2);

        Collection<Produto> list = produtoDao.buscarTodos();
        Assertions.assertNotNull(list);
        Assertions.assertTrue(list.size() >= 1);
    }

}