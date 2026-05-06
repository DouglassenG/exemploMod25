package br.com.douglas.domain;

import org.junit.jupiter.api.Test;

import br.com.douglas.services.IClienteService;

public class ClienteTest {

    private IClienteService clienteService;

    @Test
    public void pesquisarCliente() {
        Cliente cliente = new Cliente();
        cliente.setNome("Douglas");
        cliente.setCpf(123456789L);
        cliente.setTel(987654321L);
        cliente.setEnd("Rua Exemplo");
        cliente.setNumero(123);
        cliente.setCidade("São Paulo");
        cliente.setEstado("SP");

        clienteService.salvar();

        Cliente ClienteConsultado = clienteService.buscarPorCPF(cliente.getCpf())
        
        Assert.assertNotNull(ClienteConsultado);
    }
}