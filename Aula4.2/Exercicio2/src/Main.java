//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Saga[] sagas = new Saga[5];
        Livro[] livros = new Livro[5];
        Autor[] autores = new Autor[3];

        setLivros(2);
        sagas[0] = new Saga(5,2);


       // Cria um array de Livro com tamanho 1
        livros[0] = new Livro("Perdidos em São Paulo", 340);

         // Cria um array de Autor com tamanho 1
        autores[0] = new Autor("Pedro Santos", 0);

        }



    }
