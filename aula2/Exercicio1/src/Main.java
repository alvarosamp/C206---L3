import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a matrícula do aluno:");
        int matricula = scanner.nextInt();

        System.out.println("Informe o nome do aluno:");
        String nome = scanner.next();

        System.out.println("Informe o período do aluno:");
        int periodo = scanner.nextInt();

        System.out.println("Informe a nota da NP1:");
        int np1 = scanner.nextInt();

        System.out.println("Informe a nota da NP2:");
        int np2 = scanner.nextInt();

        // Criando uma instância da classe Aluno com os dados fornecidos
        Aluno aluno = new Aluno(matricula, np1, np2, periodo, nome);
        System.out.println(aluno.toString());
        // Chamando o método calculaMedia
        aluno.calculaMedia(aluno.getNp1(), aluno.getNp2());
        aluno.calculaNp3(aluno.getNp1(), aluno.getNp2());

        // Fechando o scanner
        scanner.close();
    }
}
