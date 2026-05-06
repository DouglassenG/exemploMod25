package br.com.douglas.services;

import br.com.douglas.domain.Cliente;

public interface IClienteService {

    public void salvar(Cliente cliente);

    public Cliente buscarPorCPF(Long cpf);

}
