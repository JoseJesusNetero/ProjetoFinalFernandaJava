//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import controller.SalaController;
import model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




        System.out.println( "Ola ! Bem vindo ao cinema Megalopolis :) \n" );

        System.out.println("Nos temos 4 salas disponiveis  \n");
        ///

        SalaController salas =  new SalaController();

        salas.criarSala(120, 12, 10);
        salas.criarSala(120, 12, 10);
        salas.criarSala(80,  8, 10);
        salas.criarSala(80,  8, 10);

        boolean salasAbertas  =  true,  sessoesAbertas = true;

        Scanner sc =  new Scanner(System.in);
        Scanner sc2 = new Scanner( System.in );
        //

        String[] filmes1 = { "TITANIC", "FROZEN_II", "FROZEN", "THE_LION_KING" };
        String[] filmes2 = { "AVATAR", "JURASSIC_WORLD", "STAR_WARS", "FROZEN" };
        String[] filmes3 =  { "AVENGERS_ENDGAME", "THE_AVENGERS", "HARRY_POTTER", "THE_LION_KING" };
        String[] filmes4 =  { "STAR_WARS", "FROZEN_II", "AVATAR", "JURASSIC_WORLD" };

        //
        while( salasAbertas  &&  sessoesAbertas )  {

            System.out.println( "Ola ! Bem vindo ao cinema Megalopolis :) \n" );

            System.out.println( "Nos temos 4 salas disponiveis  \n");

            //Demonstrando os filmes

            for (FilmesDisponiveis filme : FilmesDisponiveis.values()) {
                // Nome do filme como string (nome da constante do enum)
                String nomeFilme = filme.name();

                // Duração e sinopse
                int duracao = filme.getDuracao();
                String sinopse = filme.getSinopse();

                System.out.println("Filme: " + nomeFilme);
                System.out.println("Duração: " + duracao + " minutos");
                System.out.println("Sinopse: " + sinopse);
                System.out.println("-----------------------------");


            }
        }
    }


        }