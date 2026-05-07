package br.com.douglas.services;

import br.com.douglas.dao.IProdutoDAO;
import br.com.douglas.domain.Produto;
import br.com.douglas.services.generic.GenericService;

/**
 * @author douglas
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
