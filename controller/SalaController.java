package controller;

import java.util.ArrayList;
import java.util.List;


import service.SalaService;
import model.Sala;

// SalaController.java
public class SalaController {
    private final SalaService salaService;

    public SalaController() {
        this.salaService = new SalaService();
    }

    public String criarSala(int numeroAssentos, int x, int y) {
        try {
            salaService.adicionarSala(numeroAssentos, x, y);
            return "Sala criada com sucesso! (" + numeroAssentos + " assentos)";
        } catch (IllegalArgumentException e) {
            return "Erro: " + e.getMessage();
        }
    }

    public String removerSala(int numeroAssentos) {
        if (salaService.buscarSalaPorNumeroAssentos(numeroAssentos) == null) {
            return "Sala não encontrada!";
        }

        salaService.removerSalaPorNumeroAssentos(numeroAssentos);
        return "Sala removida com sucesso!";
    }

    public String listarSalas() {
        List<Sala> salas = salaService.listarTodasSalas();
        if (salas.isEmpty()) {
            return "Nenhuma sala cadastrada!";
        }

        StringBuilder sb = new StringBuilder("Lista de Salas:\n");
        for (Sala sala : salas) {
            sb.append("\nSala com ")
                    .append(sala.getNumeroAssentos())
                    .append(" assentos (")
                    .append(sala.getX())
                    .append("x")
                    .append(sala.getY())
                    .append(")");
        }
        return sb.toString();
    }
}