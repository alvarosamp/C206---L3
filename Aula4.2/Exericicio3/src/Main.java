//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Musica[] musicas = new Musica[5];

        Banda banda = new Banda(musicas,"RET",1);

        musicas[0] = new Musica("Vivendo avançado","vivaz");
        musicas[1] = new Musica("Libertina", "vivaz");

        banda.tocarMusica(0);
        banda.adicionarMusica(new Musica("perdidos", "antes tarde do que nunca"));
        banda.deletarMusica("Libertina");
        System.out.println(banda.toString());

    }
}