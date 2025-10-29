import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la base del rectángulo: ");
        double base = teclado.nextDouble();

        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = teclado.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println("Área = " + area);
        System.out.println("Perímetro = " + perimetro);

        teclado.close();
    }
}