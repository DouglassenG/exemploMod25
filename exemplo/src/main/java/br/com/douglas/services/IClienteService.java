package br.com.douglas.services;

import br.com.douglas.domain.Cliente;
import br.com.douglas.services.generic.IGenericService;

/**
 * @author douglas
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

    public Cliente buscarPorCPF(Long cpf);

}