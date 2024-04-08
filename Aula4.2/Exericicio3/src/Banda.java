public class Banda {
    private Musica[] musicas = new Musica[10];
    private String nome;
    private int numeroDeIntegrantes;

    public Banda(Musica[] musicas, java.lang.String nome, int numeroDeIntegrantes) {
        this.musicas = musicas;
        this.nome = nome;
        this.numeroDeIntegrantes = numeroDeIntegrantes;
    }



    void tocarMusica(int posicao){
        System.out.println("Tocando musica "+getMusicas()[posicao]);

    }
    void tocarshow(){
        System.out.println("Show da banda"+getNome());

    }
    boolean adicionarMusica(Musica musica) {
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i] == null) {
                musicas[i] = musica;
                return true;


            }

        }
        return  false;
    }
    boolean deletarMusica(String nome){
        for (int i = 0; i < musicas.length; i++) {
            Musica musicaAtual = musicas[i];
            if (musicaAtual != null) { // Verifica se a música na posição atual não é nula
                if (musicaAtual.getNome().equals(nome)) { // Verifica se o nome da música atual corresponde ao nome fornecido
                    // Remover a música do array
                    for (int j = i; j < musicas.length - 1; j++) {
                        musicas[j] = musicas[j + 1];
                    }
                    musicas[musicas.length - 1] = null; // Define o último elemento como nulo
                    return true; // Retorna true indicando que a música foi encontrada e deletada
                }
            }
        }
        return false; // Retorna false se a música não foi encontrada
    }

    @Override
    public java.lang.String toString() {
        return "Banda{" +
                "musicas=" + java.util.Arrays.toString(musicas) +
                ", nome=" + nome +
                ", numeroDeIntegrantes=" + numeroDeIntegrantes +
                '}';
    }

    public Musica[] getMusicas() {
        return musicas;
    }

    public void setMusicas(Musica[] musicas) {
        this.musicas = musicas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }

    public int getNumeroDeIntegrantes() {
        return numeroDeIntegrantes;
    }

    public void setNumeroDeIntegrantes(int numeroDeIntegrantes) {
        this.numeroDeIntegrantes = numeroDeIntegrantes;
    }
}
