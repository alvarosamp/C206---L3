public class Musica {
    private String nome;
    private String album;

    public Musica(java.lang.String nome, java.lang.String album) {
        this.nome = nome;
        this.album = album;
    }

    public java.lang.String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
}
