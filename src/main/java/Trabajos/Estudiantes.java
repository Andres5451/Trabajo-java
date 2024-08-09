package Trabajos;

//Hacer una aplicacion, que solicite datos de los estudiantes(3), dentro de los datos deben estar las notas.
// y requiero que se calcule el promedio de los estudiantes.
//Deben usar Clases y Objetos, y Scaner para llenar los datos de los estudiantes.

//1) Crear mi clase estudiantes
//2) definir metodos y funciones(notas)
//3)crear main
//4)llenar datos con scanner
//5)utilizar lo anterior para sacar el promedio de notas.
public class Estudiantes {
    private String nombre;
    private int edad;
    private double[] notas;

    public Estudiantes(String nombre, int edad, double[] notas) {
        this.nombre = nombre;
        this.edad = edad;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }
}