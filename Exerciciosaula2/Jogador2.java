package Exerciciosaula2;

public class Jogador2 {
    Arma2 arma2;
    public int energia;
    public int vida;
    public void atacar(Jogador2 alvo){
        if(this.energia > arma2.custoDeEnergia){
            System.out.println("A vida do alvo diminuiu em " + arma2.dano);
            alvo.vida -= arma2.dano;
            System.out.println("Sua energia diminuiu em " + arma2.custoDeEnergia);
            this.energia -= arma2.custoDeEnergia;
        }
    }
    Jogador2(){
        this.vida = 10;
        this.energia = 10;
    }
    Jogador2(Arma2 arma2, int energia, int vida){
        this.arma2 = arma2;
        this.vida = vida;
        this.energia = energia;
    }
}
