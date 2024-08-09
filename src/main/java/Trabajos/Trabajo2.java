package Trabajos;

//Elegir el mayor de 3 numeros
import java.util.Scanner;

public class Trabajo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Este programa elige el mayor de 3 números.");

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int numero3 = scanner.nextInt();

        int mayor;

            if (numero1 >= numero2 && numero1 >= numero3) {
                mayor = numero1;
            } else if (numero2 >= numero1 && numero2 >= numero3) {
                mayor = numero2;
            } else {
                mayor = numero3;
            }
            System.out.print("El número mayor es: " + mayor);
            scanner.close();
    }
}
