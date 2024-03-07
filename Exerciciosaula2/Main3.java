package Exerciciosaula2;

public class Main3 {

        public static void main(String[] args) {
            Rato2 rato = new Rato2(60);
            Gato3 gato = new Gato3("preto", 9, 80);
            rato.procurarComida();
            rato.esconder();
            rato.procurarComida();
            gato.caçar(rato);
        }

}
