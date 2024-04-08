import java.util.Scanner;
public class Aluno {
    private int matricula;
    private int np1;
    private int np2;
    private int periodo;
    private String nome;
    Scanner scanner = new Scanner(System.in);

    public Aluno(int matricula, int np1, int np2, int periodo, String nome){
        this.matricula = matricula;
        this.nome = nome;
        this.periodo = periodo;
        this.np1 = np1;
        this.np2 = np2;
    }

    int calculaMedia(int np1, int np2) {
        int media;
        media = (np1 + np2) / 2;
        if (media >= 60){
            System.out.println("Sua media é de: " + media +" . Logo voce foi aprovado");

        }else{
            System.out.println("Sua media é de: " + media +" . Logo voce foi está de np3");

        }
        return media;
    }
    int calculaNp3(int np1, int np2){
        int nota;
        nota = calculaMedia(np1,np2);
        if(nota >=60){
            System.out.println("Voce nao precisa fazer np3");
        }
        else{
            int conta;
            int np3;
            conta = 100-nota;
            System.out.println("Quanto voce tirou na np3? :");

            np3= scanner.nextInt();
            if(np3 >= conta){
                System.out.println("Voce foi aprovado");
            }
            else{
                System.out.println("Voce foi reprovado");
            }
        }

    return nota;
    }


    public int getNp1() {
        return np1;
    }



    public int getNp2() {
        return np2;
    }



}