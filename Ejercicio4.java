import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese a: ");
        double a = teclado.nextDouble();

        System.out.print("Ingrese b: ");
        double b = teclado.nextDouble();

        System.out.print("Ingrese c: ");
        double c = teclado.nextDouble();

        double resultado1 = (a + b) * c;
        System.out.println("(a + b) * c = " + resultado1);

        if (c == 0) {
            System.out.println("(a^2 + b^2) / c = Error: división por cero");
        } else {
            double resultado2 = (a * a + b * b) / c;
            System.out.println("(a^2 + b^2) / c = " + resultado2);
        }

        double promedio = (a + b + c) / 3.0;
        System.out.println("(a + b + c) / 3 = " + promedio);

        teclado.close();
    }
}