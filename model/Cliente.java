package model;

public class  Cliente  extends Pessoa{

    String escolhaFilme;
    int sessaoIndex ;
    String email;

    public Cliente( String _nome, String _cpf, int _idade , String _escolhaFilme, int _sessaoIndex, String _email)  {

        super( _nome, _cpf, _idade) ;
        ///
        this.escolhaFilme = _escolhaFilme;
        this.sessaoIndex  =  _sessaoIndex;
        this.email  =  _email;
    }

    @Override
    public  void  minhaPessoa() {

        System.out.println( "Ola, eu sou o " + getNome()  + "  e tenho "  + getIdade()+ "  \n");

    }

    /// Getters and SETTERS

    public String getEscolhaFilme() {
        return escolhaFilme;
    }

    public void setEscolhaFilme(String escolhaFilme) {
        this.escolhaFilme = escolhaFilme;
    }

    public int getSessaoIndex() {
        return sessaoIndex;
    }

    public void setSessaoIndex(int sessaoIndex) {
        this.sessaoIndex = sessaoIndex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
