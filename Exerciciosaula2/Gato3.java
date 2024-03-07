package Exerciciosaula2;

public class Gato3 {

        Rato2 rato2;
        public String cor;
        public int idade;
        public int velocidade;
        public void caçar(Rato2 rato2){
            if(this.velocidade > rato2.velocidade){
                if(rato2.escondido == true){
                    System.out.println("O rato fugiu!");
                }
                else{
                    System.out.println("Você pegou o rato!");
                }
            }
            else{
                System.out.println("O rato fugiu!");
            }

        }
        public String toString(){
            return "Cor do Gato: " + this.cor + "Idade do Gato: " + this.idade + "Velocidade do Gato: " + this.velocidade;
        }
        public Gato(String Cor, int idade, int velocidade){
            this.cor = Cor;
            this.idade = idade;
            this.velocidade = velocidade;
        }

}
