package br.com.douglas.services;

import br.com.douglas.domain.Cliente;

public interface IClienteService {

    public void salvar();

    public Cliente buscarPorCPF(Long cpf);

    void salvar(Cliente cliente);

    

}
