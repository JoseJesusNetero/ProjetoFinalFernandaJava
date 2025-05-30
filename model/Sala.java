package model;

public class Sala {


    int x,  y;
    int numeroAssentos;
    String[] sessoes;
    char[][] poltronas;
    int cheio ;
    int duracao ;

    public Sala( int _numeroAssentos, int _x, int _y ) {

        duracao = 900;  /// a soma das duraçoes tem que ser no maximo de 900 minutos
        cheio = 0;
        sessoes =  new String[ 4 ];


        for( int i = 0; i < 4; i++) {  ///  cada sala tera 900 minutos duracao


            this.sessoes[ i ] = " ";
        }

        this.numeroAssentos = _numeroAssentos;
        this.x = _x;
        this.y = _y;
        ///

        if( ( x * y ) != numeroAssentos)  {

            System.out.println( "Error") ;
        }

        this.poltronas  =  new char[ x ][ y ];



        for( int i = 0; i < x; i++) {

            for( int j = 0; j < y ; j++)

                poltronas[ i ][ j ] = '0';  // Vazia
        }


    }


    /// FUNCOES  PROPRIAS
    public void alocarFilmes( String[] filmes )  {

        for( int i = 0;  i <  sessoes.length; i++) {

            this.sessoes[ i ]  =  filmes[ i ];
        }

    }

    public char retornaCadeira( int x, int y ) {

        if  ( ( x  >=  this.x )  ||  ( y >=  this.y )  || ( x < 0 )  || ( y  <  0)  ) {


            return 'a';


        }

        return  poltronas[ x ][ y ];
    }
    ///  GETTERS AND SETTERS
    public Sala(String[] sessoes) {
        this.sessoes = sessoes;
    }


    public String[] getSessoes() {
        return sessoes;
    }

    public void setSessoes(String[] sessoes) {
        this.sessoes = sessoes;
    }

    public char[][] getPoltronas() {
        return poltronas;
    }

    public void setPoltronas(char[][] poltronas) {
        this.poltronas = poltronas;

    }
        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getNumeroAssentos() {
            return numeroAssentos;
        }

        public void setNumeroAssentos(int numeroAssentos) {
            this.numeroAssentos = numeroAssentos;
        }

        public int getCheio() {
            return cheio;
        }

        public void setCheio(int cheio) {
            this.cheio = cheio;
        }

        public int getDuracao() {
            return duracao;
        }

        public void setDuracao(int duracao) {
            this.duracao = duracao;
        }
    }

