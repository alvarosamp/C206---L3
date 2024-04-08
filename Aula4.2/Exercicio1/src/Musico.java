public class Musico {
    private Album[] albums;
    private String nome;

    public Musico(Album[] albums, String nome) {
        this.albums = albums;
        this.nome = nome;
    }

    void lista() {
        for(int i = 0; i < albums.length; i++) {
            System.out.println(albums[i]);
        }
    }

    void adicionar(Album novoAlbum) {
        // Cria um novo array com tamanho aumentado em 1
        Album[] novoArray = new Album[albums.length + 1];

        // Copia os álbuns do array original para o novo array
        for (int i = 0; i < albums.length; i++) {
            novoArray[i] = albums[i];
        }

        // Adiciona o novo álbum ao final do novo array
        novoArray[novoArray.length - 1] = novoAlbum;

        // Atualiza a referência para o novo array
        albums = novoArray;
    }

    void deletar(int posicao) {
        // Verifica se a posição é válida
        if (posicao < 0 || posicao >= albums.length) {
            System.out.println("Posição inválida");
            return;
        }

        // Cria um novo array com tamanho menor
        Album[] novoArray = new Album[albums.length - 1];

        // Copia os álbuns do array original para o novo array, excluindo o álbum na posição especificada
        int novoIndice = 0;
        for (int i = 0; i < albums.length; i++) {
            if (i != posicao) {
                novoArray[novoIndice] = albums[i];
                novoIndice++;
            }
        }

        // Atualiza a referência para o novo array
        albums = novoArray;
    }
}
