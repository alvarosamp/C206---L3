public class Exercicio1 {

    public static int fatorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }

    public static void mostraPares(int n) {
        for (int g = n; g > 0; g--) {
            if (g % 2 == 0) {
                System.out.println(g);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Fatorial de 3: ");
        System.out.println(fatorial(3));
        System.out.println(" ");
        System.out.println("Pares do número 16: ");
        mostraPares(16);


    }
}
