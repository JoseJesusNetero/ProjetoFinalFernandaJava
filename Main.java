//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import controller.*
import model.*

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        SalaController salaController = new SalaController();
        ClienteController clienteController = new ClienteController();
        ClienteEstudanteController clienteEstudanteController = new ClienteEstudanteController();

        // Criar salas e alocar filmes (exemplo)
        salaController.criarSala(120, 12, 10);
        salaController.criarSala(120, 12, 10);
        salaController.criarSala(80, 8, 10);
        salaController.criarSala(80, 8, 10);

        // Alocar filmes manualmente (exemplo)
        String[] filmes1 = {"TITANIC", "FROZEN_II", "FROZEN", "THE_LION_KING"};
        String[] filmes2 = {"AVATAR", "JURASSIC_WORLD", "STAR_WARS", "FROZEN"};
        String[] filmes3 = {"AVENGERS_ENDGAME", "THE_AVENGERS", "HARRY_POTTER", "THE_LION_KING"};
        String[] filmes4 = {"STAR_WARS", "FROZEN_II", "AVATAR", "JURASSIC_WORLD"};

        // Alocar filmes nas salas
        SalaController salas = salaController.salaService.listarTodasSalas();
        if (salas.size() >= 4) {
            salas.get(0).alocarFilmes(filmes1);
            salas.get(1).alocarFilmes(filmes2);
            salas.get(2).alocarFilmes(filmes3);
            salas.get(3).alocarFilmes(filmes4);
        }

        Scanner sc = new Scanner(System.in);

        boolean salasAbertas = true;
        boolean sessoesAbertas = true;

        while (salasAbertas && sessoesAbertas) {

            System.out.println("Filmes disponíveis:");
            for (FilmesDisponiveis filme : FilmesDisponiveis.values()) {
                System.out.println(filme.name().replace("_", " ") + " - " + filme.getDuracao() + " min");
            }

            System.out.print("\nEscolha um filme pelo nome (exato): ");
            String filmeEscolhido = sc.nextLine().trim().toUpperCase();

            Sala salaEncontrada = salaController.buscarSalaPorFilme(filmeEscolhido);

            if (salaEncontrada == null) {
                System.out.println("Nenhuma sala com esse filme encontrada.");
                continue;
            }

            System.out.println("Sala encontrada com " + salaEncontrada.getNumeroAssentos() + " assentos.");
            salaController.exibirPoltronas(salaEncontrada);

            if (salaEncontrada.getCheio() >= salaEncontrada.getNumeroAssentos()) {
                System.out.println("Sala cheia, escolha outro filme.");
                continue;
            }

            System.out.print("Deseja reservar uma poltrona? (sim/nao): ");
            String resposta = sc.nextLine().trim().toLowerCase();

            if (!resposta.equals("sim")) {
                System.out.println("Reserva cancelada.");
                continue;
            }

            System.out.print("Informe a posição X (linha): ");
            int posX = Integer.parseInt(sc.nextLine());

            System.out.print("Informe a posição Y (coluna): ");
            int posY = Integer.parseInt(sc.nextLine());

            boolean sucesso = salaController.alocarPoltrona(salaEncontrada, posX, posY);

            if (!sucesso) {
                System.out.println("Falha ao reservar poltrona, tente novamente.");
                continue;
            }

            System.out.print("Você é cliente estudante? (sim/nao): ");
            String tipoCliente = sc.nextLine().trim().toLowerCase();

            System.out.print("Digite seu nome: ");
            String nome = sc.nextLine();

            System.out.print("Digite seu CPF: ");
            String cpf = sc.nextLine();

            System.out.print("Digite sua idade: ");
            int idade = Integer.parseInt(sc.nextLine());

            System.out.print("Digite seu email: ");
            String email = sc.nextLine();

            if (tipoCliente.equals("sim")) {
                System.out.print("Digite sua instituição: ");
                String instituicao = sc.nextLine();

                System.out.print("Digite sua matrícula: ");
                String matricula = sc.nextLine();

                ClienteEstudante estudante = new ClienteEstudante(nome, cpf, idade, filmeEscolhido, posX, email, instituicao, matricula);
                clienteEstudanteController.adicionarClienteEstudante(estudante);
                System.out.println("Cliente estudante cadastrado com sucesso!");
            } else {
                Cliente cliente = new Cliente(nome, cpf, idade, filmeEscolhido, posX, email);
                clienteController.adicionarCliente(cliente);
                System.out.println("Cliente cadastrado com sucesso!");
            }

            // Verifica se todas as salas estão cheias para encerrar loop
            if (salaController.todasSalasCheias()) {
                System.out.println("Todas as salas estão cheias. Encerrando sistema.");
                salasAbertas = false;
                sessoesAbertas = false;
            }
        }

        sc.close();
    }
}
