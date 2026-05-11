package br.com.douglas.domain.dao;

import java.util.Collection;

import br.com.douglas.dao.IProdutoDAO;
import br.com.douglas.domain.Produto;
import br.com.douglas.exceptions.TipoChaveNaoEncontradaException;

/**
 * Mock do ProdutoDAO para uso nos testes de Service.
 * Simula o comportamento do DAO sem usar o banco de dados real.
 */
public class ProdutoDaoMock implements IProdutoDAO {

    @Override
    public Boolean cadastrar(Produto entity) throws TipoChaveNaoEncontradaException {
        return true;
    }

    @Override
    public void excluir(String valor) {
        // Mock: não faz nada propositalmente
    }

    @Override
    public void alterar(Produto entity) throws TipoChaveNaoEncontradaException {
        // Mock: não faz nada propositalmente
    }

    @Override
    public Produto consultar(String valor) {
        Produto produto = new Produto();
        produto.setCodigo(valor);
        return produto;
    }

    @Override
    public Collection<Produto> buscarTodos() {
        return null;
    }

}