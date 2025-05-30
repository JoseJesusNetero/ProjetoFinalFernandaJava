package service;


import model.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClienteService {

    private List<Cliente> clientes;

    public ClienteService() {
        this.clientes = new ArrayList<>();
    }

    // Adiciona um cliente à lista
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    // Remove cliente pelo CPF (único identificador)
    public boolean removerClientePorCpf(String cpf) {
        return clientes.removeIf(cliente -> cliente.getCpf().equals(cpf));
    }

    // Retorna a lista completa de clientes
    public List<Cliente> listarClientes() {
        return new ArrayList<>(clientes); // Retorna cópia para evitar alterações externas
    }

    // Busca um cliente pelo CPF (opcional)
    public Optional<Cliente> buscarClientePorCpf(String cpf) {
        return clientes.stream()
                .filter(cliente -> cliente.getCpf().equals(cpf))
                .findFirst();
    }
}