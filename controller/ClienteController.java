package controller;

import model.Cliente;
import service.ClienteService;

import java.util.List;
import java.util.Optional;

public class ClienteController {

    private ClienteService clienteService;

    public ClienteController() {
        this.clienteService = new ClienteService();
    }

    // Adiciona um cliente
    public void adicionarCliente(Cliente cliente) {
        clienteService.adicionarCliente(cliente);
    }

    // Remove cliente pelo CPF, retorna true se removido com sucesso
    public boolean removerClientePorCpf(String cpf) {
        return clienteService.removerClientePorCpf(cpf);
    }

    // Retorna a lista de todos os clientes
    public List<Cliente> listarClientes() {
        return clienteService.listarClientes();
    }

    // Busca cliente pelo CPF
    public Optional<Cliente> buscarClientePorCpf(String cpf) {
        return clienteService.buscarClientePorCpf(cpf);
    }
}