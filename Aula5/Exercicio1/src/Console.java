public class Console extends Produto {
    private String geracao;
    private String marca;

    //Passando os atributos da classe pai
    public Console(java.lang.String geracao, java.lang.String marca,double preco, java.lang.String nome) {
        super(preco,nome);//Pegando os construtores da classe pai
        this.geracao = geracao;
        this.marca = marca;
    }

    void jogar(){
        System.out.println("jogando no momento");
    }

    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Geração: "+ this.geracao);
        System.out.println("Marca: "+ this.marca);
        
    }



}
