package br.com.douglas.services;

import br.com.douglas.dao.IClienteDAO;
import br.com.douglas.domain.Cliente;
import br.com.douglas.services.generic.GenericService;

/**
 * @author douglas
 */
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

    public ClienteService(IClienteDAO clienteDAO) {
        super(clienteDAO);
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return this.dao.consultar(cpf);
    }

}