package br.com.douglas.dao;

import br.com.douglas.dao.generic.GenericDAO;
import br.com.douglas.domain.Cliente;


/**
 * @author douglas
 *
 */
public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

	public ClienteDAO() {
		super();
	}

	@Override
	public Class<Cliente> getTipoClasse() {
		return Cliente.class;
	}

	@Override
	public void atualiarDados(Cliente entity, Cliente entityCadastrado) {
		entityCadastrado.setCidade(entity.getCidade());
		entityCadastrado.setCpf(entity.getCpf());
		entityCadastrado.setEnd(entity.getEnd());
		entityCadastrado.setEstado(entity.getEstado());
		entityCadastrado.setNome(entity.getNome());
		entityCadastrado.setNumero(entity.getNumero());
		entityCadastrado.setTel(entity.getTel());
		
	}

	@Override
	public void salvar(Cliente cliente) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'salvar'");
	}



}
