import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int n = teclado.nextInt();

        boolean esPositivo = n > 0;
        boolean esPar = n % 2 == 0;

        if (esPositivo && esPar) {
            System.out.println(n + " es positivo y par.");
        } else {
            System.out.println(n + " NO es (positivo y par).\n");
            System.out.println("Positivo? " + esPositivo + ", Par? " + esPar);
        }

        teclado.close();
    }
}