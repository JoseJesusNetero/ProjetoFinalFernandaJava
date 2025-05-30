

public enum FilmesDisponiveis {
    AVATAR(162, "Um soldado humano se envolve com os habitantes do planeta Pandora."),
    TITANIC(195, "A trágica história do navio Titanic e um romance proibido."),
    STAR_WARS(121, "A saga épica da luta entre o bem e o mal na galáxia."),
    AVENGERS_ENDGAME(181, "Os heróis se unem para derrotar Thanos e salvar o universo."),
    THE_LION_KING(118, "A jornada de Simba para se tornar rei da selva."),
    FROZEN_II(103, "Anna e Elsa embarcam numa aventura para descobrir a origem dos poderes de Elsa."),
    JURASSIC_WORLD(124, "Dinossauros geneticamente modificados causam caos em um parque temático."),
    THE_AVENGERS(143, "Os Vingadores se reúnem para salvar o planeta."),
    HARRY_POTTER(152, "As aventuras do jovem bruxo Harry Potter na escola de magia."),
    FROZEN(102, "A história das irmãs Elsa e Anna e o poder do amor fraternal.");

    private final int duracao; // duração em minutos
    private final String sinopse;

    FilmesDisponiveis(int duracao, String sinopse) {
        this.duracao = duracao;
        this.sinopse = sinopse;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getSinopse() {
        return sinopse;
    }
}