//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato("laranja",45,10);
        Rato rato = new Rato(80,false);

        gato.brincar();
        gato.caçar(rato);
        gato.toString();

        rato.esconder(rato.isEscondido());
       // rato.procurarComida();
        rato.toString();



    }
}