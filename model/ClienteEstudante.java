package model;

public class ClienteEstudante extends Cliente{

    String instituicao;
    String matricula;

    public  ClienteEstudante( String _nome, String _cpf, int _idade , String _escolhaFilme, int _sessaoIndex, String _email, String _instituicao, String _matricula)  {

        super( _nome, _cpf,_idade , _escolhaFilme, _sessaoIndex, _email);

        this.instituicao = _instituicao;
        this.matricula   = _matricula;

    }









    /// Getters  And Setters
    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
