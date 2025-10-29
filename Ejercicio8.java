import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número entero n: ");
        int n = teclado.nextInt();

        // n^2 y n^3
        long n2 = (long) n * n;
        long n3 = (long) n * n * n;
        System.out.println("n^2 = " + n2);
        System.out.println("n^3 = " + n3);

        // n! factorial (para n >= 0)
        if (n < 0) {
            System.out.println("Factorial no definido para n negativo.");
        } else {
            long fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("n! = " + fact);
        }

        // verificar si n > 10 y par
        boolean condicion = (n > 10) && (n % 2 == 0);
        System.out.println("¿n > 10 y par? " + condicion);

        // actualizar n: sumarle 5 y luego multiplicarlo por 2
        n += 5;
        System.out.println("n después de sumarle 5 = " + n);
        n *= 2;
        System.out.println("n después de multiplicarlo por 2 = " + n);

        teclado.close();
    }
}