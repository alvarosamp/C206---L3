public class Livro {
    private String titulo;
    private int paginas;
    public Livro(String titulo, int paginas){
        this.titulo = titulo;
        this.paginas = paginas;
    }

    public java.lang.String getTitulo() {
        return titulo;
    }

    public void setTitulo(java.lang.String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
}
