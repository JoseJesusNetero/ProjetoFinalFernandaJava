package service;

import model.Sala;

// SalaService.java
import java.util.ArrayList;
import java.util.List;

public class SalaService {
    private final List<Sala> salas = new ArrayList<>();


    public void adicionarSala(int numeroAssentos, int x, int y) throws IllegalArgumentException {
        // Validação de negócio
        if (x * y != numeroAssentos) {
            throw new IllegalArgumentException("Dimensões X e Y não correspondem ao número de assentos");
        }


        salas.add(new Sala(numeroAssentos, x, y));
    }

    public void removerSalaPorNumeroAssentos(int numeroAssentos) {
        Sala sala = buscarSalaPorNumeroAssentos(numeroAssentos);
        if (sala != null) {
            salas.remove(sala);
        }
    }

    public List<Sala> listarTodasSalas() {
        return new ArrayList<>(salas); // Retorna cópia para evitar modificações externas
    }

    public Sala buscarSalaPorNumeroAssentos(int numeroAssentos) {
        return salas.stream()
                .filter(s -> s.getNumeroAssentos() == numeroAssentos)
                .findFirst()
                .orElse(null);
    }

    }
