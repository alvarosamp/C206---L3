public class Jogador  {
    private Arma arma;
    private int energia;
    private int vida;
    public Jogador(){

    }
    public Jogador(Arma arma, int energia, int vida){
        this.arma = arma;
        this.energia = energia;
        this.vida = vida;
    }
    public Jogador(int vida, int energia) {
        this.vida = vida;
        this.energia = energia;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void atacar(Jogador alvo){

        if(this.energia> this.arma.custoDeEnergia){
            alvo.vida -= this.arma.getDano();
            this.energia -= this.arma.custoDeEnergia;
        }

    }

    @Override
    public String toString() {
        return "Jogador{" +
                "arma=" + arma +
                ", vida=" + vida +
                ", energia=" + energia +
                '}';
    }
}