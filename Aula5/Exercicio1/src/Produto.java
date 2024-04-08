//classe pai
public class Produto  {
    private double preco;
    private String nome;

    public Produto(double preco, java.lang.String nome) {
        this.preco = preco;
        this.nome = nome;
    }
    void mostraInfo(){
        System.out.println("Preço: "+ preco);
        System.out.println("Nome: " +nome);
    }


}
