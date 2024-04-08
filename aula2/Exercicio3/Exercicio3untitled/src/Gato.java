public class Gato {
    private String cor;
    private int idade;
    private int velocidade;


    public Gato(String cor, int idade, int velocidade){
        this.cor = cor;
        this.idade = idade;
        this.velocidade = velocidade;
    }
    void brincar(){
        System.out.println("O gato está brincando");
    }
    void caçar(Rato rato){

      boolean caça = rato.isEscondido();
        if(caça){
            System.out.println("O gato nao pegou o rato");
        }
        else{
            if(rato.getVelocidade() > this.getVelocidade()){
                System.out.println("O rato fugiu");
            }
            else{
                System.out.println("O gato pegou o gato");
            }
        }
    }

    public java.lang.String getCor() {
        return cor;
    }



    public int getVelocidade() {
        return velocidade;
    }


    @Override
    public java.lang.String toString() {
        return "Gato{" +
                "cor=" + cor +
                ", idade=" + idade +
                ", velocidade=" + velocidade +
                '}';
    }
}
