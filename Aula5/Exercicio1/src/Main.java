//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Console console = new Console("4º geracao","Samsung",800,"DualCore");
        Notebook notebook = new Notebook(" i5","256",600,"Intel");
        Produto produto = new Produto(1300,"Sem nome");

        console.mostraInfo();
        console.jogar();

        notebook.instalarAplicativo();
        notebook.mostraInfo();

        produto.mostraInfo();
    }
}