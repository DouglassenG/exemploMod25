package br.com.douglas.services;

import br.com.douglas.dao.IClienteDAO;
import br.com.douglas.domain.Cliente;

public class ClienteService implements IClienteService {

    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO; 
    }

    @Override
    public void salvar(Cliente cliente) {
        clienteDAO.salvar(cliente); // Lógica para salvar o cliente usando o DAO
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        // Lógica para buscar o cliente por CPF
        return null; // Retornar o cliente encontrado ou null se não encontrado
    }

    @Override
    public void salvar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'salvar'");
    }

}
