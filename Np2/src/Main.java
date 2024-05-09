import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Capitao nascimento = new Capitao("Capitao Nasicmento","Bandido",190,3450);
       Pirata Edward = new Pirata("Edward","peixe", 309);
       Espadachim esgrima = new Espadachim("Zé da faca","ostras",760,"katana");
       Cozinheiro cozinheiro = new Cozinheiro("Fogaça","ovo",30,"macarrao",);

       cozinheiro.prepararPrato(0);
       nascimento.conquistarNovoSeguidor(Edward);
       nascimento.darOrdens();
       nascimento.mudarRota();
       esgrima.darOrdens();
       esgrima.mudarRota();
       cozinheiro.mostrarReceita();
       Edward.comer(cozinheiro,0);





    }
}