public class Notebook extends Produto{
    private String processador;
    private String memoria;

    //Colando os argumentos da classe pai tambem
    public Notebook(java.lang.String processador, java.lang.String memoria,double preco, java.lang.String nome) {
        super(preco,nome);//Pegando os construtores da classe pai
        this.processador = processador;
        this.memoria = memoria;
    }

    void instalarAplicativo(){
        System.out.println("Instalando app");
    }


    void mostraInfo(){
        System.out.println("Nome: "+ getNome());
        System.out.println("Processador : " +this.processador);
        System.out.println("Memoria: " +this.memoria);
        System.out.println("Preco: " + getPreco());


    }

}
