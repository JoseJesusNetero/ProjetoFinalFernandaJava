package model;

public abstract class Pessoa {

    String  nome;
    String  cpf;
    int     idade;

    public  Pessoa( String _nome, String _cpf, int _idade)

    {
        this.nome = _nome;
        this.cpf  = _cpf;
        this.idade = _idade;


    }

    public abstract void minhaPessoa();


    /// Getters and Setters
    ///
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
