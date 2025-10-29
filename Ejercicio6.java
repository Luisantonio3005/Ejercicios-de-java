import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n = teclado.nextInt();

        if (n >= 10 && n <= 20) {
            System.out.println(n + " está entre 10 y 20 (inclusive).\n");
        } else {
            System.out.println(n + " NO está entre 10 y 20 (inclusive).\n");
        }

        teclado.close();
    }
}