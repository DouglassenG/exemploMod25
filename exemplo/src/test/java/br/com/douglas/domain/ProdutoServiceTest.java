package br.com.douglas.domain;

import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.douglas.dao.IProdutoDAO;
import br.com.douglas.domain.dao.ProdutoDaoMock;
import br.com.douglas.exceptions.TipoChaveNaoEncontradaException;
import br.com.douglas.services.IProdutoService;
import br.com.douglas.services.ProdutoService;

/**
 * @author rodrigo.pires
 */
public class ProdutoServiceTest {

    private IProdutoService produtoService;

    private Produto produto;

    public ProdutoServiceTest() {
        IProdutoDAO dao = new ProdutoDaoMock();
        produtoService = new ProdutoService(dao);
    }

    @BeforeEach
    public void init() {
        produto = new Produto();
        produto.setCodigo("A1");
        produto.setDescricao("Produto 1");
        produto.setNome("Produto 1");
        produto.setValor(BigDecimal.TEN);
    }

    @Test
    public void pesquisar() {
        Produto produtor = this.produtoService.consultar(produto.getCodigo());
        Assertions.assertNotNull(produtor);
    }

    @Test
    public void salvar() throws TipoChaveNaoEncontradaException {
        Boolean retorno = produtoService.cadastrar(produto);
        Assertions.assertTrue(retorno);
    }

    @Test
    public void excluir() {
        produtoService.excluir(produto.getCodigo());
    }

    @Test
    public void alterarProduto() throws TipoChaveNaoEncontradaException {
        produto.setNome("Produto Alterado");
        produtoService.alterar(produto);
        Assertions.assertEquals("Produto Alterado", produto.getNome());
    }

}