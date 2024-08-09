package main.java.Trabajos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Trabajos.Estudiantes[] estudiantes = new Trabajos.Estudiantes[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingress los dates del estudiante " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = scanner.nextInt();

            System.out.print("Número de notas: ");
            int numNotas = scanner.nextInt();
            double[] notas = new double[numNotas];

            for (int j = 0; j < numNotas; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[j] = scanner.nextDouble();
            }

            estudiantes[i] = new Trabajos.Estudiantes(nombre, edad, notas);
            scanner.nextLine();
        }

        System.out.println("\nPromedios de los estudiantes:");
        for (Trabajos.Estudiantes estudiante : estudiantes) {
            System.out.println(estudiante.getNombre() + ": " + estudiante.calcularPromedio());
        }

        scanner.close();
    }
}
