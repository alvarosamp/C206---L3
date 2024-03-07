package Exerciciosaula2;
import java.util.Scanner;
public class Aluno2 {

        Scanner entrada = new Scanner(System.in);
        public int matricula;
        public int np1;
        public int np2;
        public int periodo;
        public String nome;

        public int calcularNP3(int media){
            System.out.println("Insira a nota da sua np3: ");
            int np3 = entrada.nextInt();
            if(((np3 + media)/2) > 50){
                System.out.println("Você passou");
            }
            else{
                System.out.println("Você reprovou");
            }
            return media;
        }
        public int calcularMedia(){
            System.out.println("Insira o seu nome: ");
            this.nome = entrada.nextLine();
            System.out.println("Insira o seu periodo: ");
            this.periodo = entrada.nextInt();
            System.out.println("Insira o valor da sua np1: ");
            this.np1 = entrada.nextInt();
            System.out.println("Insira o valor da sua np2: ");
            this.np2 = entrada.nextInt();
            int media = (this.np1 + this.np2) / 2;
            if(media < 60){
                System.out.println("Você foi para a np3");
                calcularNP3(media);
            }
            else{
                System.out.println("Você passou");
            }
            return media;
        }
        public String toString(){
            return "Matricula: " + this.matricula + "Periodo: " + this.periodo + "Nome: " + this.periodo;
        }

}
