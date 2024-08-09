package Clase2;

import java.util.Scanner;

public class main {



    public static void main(String[] args) {

        Carro carro1 = new Carro("Rojo");
        System.out.println(new Carro());
        System.out.println( carro1.getColor());
        carro1.setColor("Verde");
        System.out.println( carro1.getColor());


        //ENTRADA Y SALIDA DE DATOS

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola - ");
        System.out.println("Dame tu nombre");
        var nombre=scanner.next();
        System.out.println("Tu nombre es "+ nombre);


        System.out.println("Dame tu edad");
        var edad=scanner.nextInt();
        System.out.println("Tu edad es "+ edad);




    }
}
