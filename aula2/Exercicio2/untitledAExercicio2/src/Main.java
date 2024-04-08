//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Arma arma = new Arma(10,10);
        Jogador jogador1 = new Jogador(new Arma(10, 10), 50, 100);
        Jogador jogador2 = new Jogador(arma,50,100);

        jogador2.setVida(1000000);

        System.out.println(jogador2);
        System.out.println(jogador1);

        jogador1.atacar(jogador2);

        System.out.println(jogador2);
        System.out.println(jogador1);
    }
    }
