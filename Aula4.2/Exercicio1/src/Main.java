//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

            public static void main(String[] args) {
                // Criando alguns álbuns
                Album album1 = new Album("Álbum 1", 8);
                Album album2 = new Album("Álbum 2", 9);
                Album album3 = new Album("Álbum 3", 7);

                // Criando um array de álbuns
                Album[] albums = {album1, album2};

                // Criando um músico com os álbuns existentes
                Musico musico = new Musico(albums, "Nome do Músico");

                // Listando os álbuns
                System.out.println("Álbuns do Músico:");
                musico.lista();

                // Adicionando um novo álbum
                musico.adicionar(album3);

                // Listando os álbuns novamente após a adição
                System.out.println("\nÁlbuns do Músico após adição:");
                musico.lista();

                // Deletando o segundo álbum
                musico.deletar(1);

                // Listando os álbuns novamente após a remoção
                System.out.println("\nÁlbuns do Músico após remoção:");
                musico.lista();
            }


}