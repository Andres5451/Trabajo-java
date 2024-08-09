package main.java.Trabajos;
//calculadora try-catch
import java.util.Scanner;

public class Trabajo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("\nCalculadora Simple");
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicación");
                System.out.println("4. División");
                System.out.println("5. Salir");
                System.out.print("Elija una opción: ");

                int opcion = Integer.parseInt(scanner.nextLine());

                if (opcion == 5) {
                    System.out.println("Gracias por usar la calculadora. ¡Hasta luego!");
                    break;
                }

                if (opcion < 1 || opcion > 4) {
                    throw new IllegalArgumentException("Opción no válida");
                }

                System.out.print("Ingrese el primer número: ");
                double num1 = Double.parseDouble(scanner.nextLine());

                System.out.print("Ingrese el segundo número: ");
                double num2 = Double.parseDouble(scanner.nextLine());

                double resultado = 0;

                switch (opcion) {
                    case 1:
                        resultado = num1 + num2;
                        break;
                    case 2:
                        resultado = num1 - num2;
                        break;
                    case 3:
                        resultado = num1 * num2;
                        break;
                    case 4:
                        if (num2 == 0) {
                            throw new ArithmeticException("No se puede dividir por cero");
                        }
                        resultado = num1 / num2;
                        break;
                }

                System.out.println("El resultado es: " + resultado);

            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese solo números válidos.");
            } catch (ArithmeticException e) {
                System.out.println("Error aritmético: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: " + e.getMessage());
            }
        }

        scanner.close();
    }
}