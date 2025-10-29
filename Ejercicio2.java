import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite el primer entero: ");
        int a = teclado.nextInt();

        System.out.print("Digite el segundo entero: ");
        int b = teclado.nextInt();

        if (b == 0) {
            System.out.println("Error: división por cero no permitida.");
        } else {
            int divEntera = a / b;
            double divDecimal = (double) a / (double) b;

            System.out.println("División entera = " + divEntera);
            System.out.println("División decimal = " + divDecimal);
        }

        teclado.close();
    }
}