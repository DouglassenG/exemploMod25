package br.com.douglas.dao;

import br.com.douglas.dao.generic.IGenericDAO;
import br.com.douglas.domain.Venda;
import br.com.douglas.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author douglas
 *
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}