package Exerciciosaula2;

public class Main2 {

        public static void main(String[] args) {
            Jogador2 jogador = new Jogador2(new Arma2(5,4), 20, 30);
            Jogador2 alvo = new Jogador2();
            jogador.atacar(alvo);
        }

}
