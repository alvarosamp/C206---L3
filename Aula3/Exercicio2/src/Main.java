//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Cliente cliente = new Cliente("Alvaro","19855339797",1200,3000);
    cliente.sacarDinheiro(800);
    cliente.depositarDinheiro(300);
    System.out.println(cliente.toString());

    }
}