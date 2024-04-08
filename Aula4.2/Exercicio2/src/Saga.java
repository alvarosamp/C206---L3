public class Saga {
    private int nota;
    private Livro[] livros;

    public Saga(int nota, Livro[] livros) {
        this.nota = nota;
        this.livros = livros;
    }
    void listarLivros(){
        for (int i = 0; i < livros.length; i++) {
            System.out.println(livros[i]);
        }
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

    void adicionarLivro(Livro novoLivro) {
        // Cria um novo array com tamanho aumentado em 1
        Livro[] novo = new Livro[livros.length + 1];

        // Copiando os livros do array original para o novo array
        for (int i = 0; i < livros.length; i++) {
            novo[i] = livros[i];
        }

        // Adicionando o novo livro ao final do novo array
        novo[novo.length - 1] = novoLivro;

        // Atualizando a referência para o novo array
        this.livros = novo;
    }
}






