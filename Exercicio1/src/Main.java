public class Main {
    public static void main(String[] args) {
        Jogador jogador2 = new Jogador(new Arma(5, 4), 20, 30);
        Jogador alvo = new Jogador();
        jogador2.atacar(alvo);
    }
}
