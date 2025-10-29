import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el radio de la esfera: ");
        double r = teclado.nextDouble();

        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);

        System.out.printf("Volumen de la esfera = %.6f%n", volumen);

        teclado.close();
    }
}