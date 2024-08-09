package Clase4;

public class Main {

    public static void main(String[] args) {

        int contador = 0;

        while (contador<=5){
            System.out.println(contador);
            contador++;
        }

        /////////////////Separador////////////////////
        System.out.println("------------------Separar-------------------");
        contador = 0;
        do {
            System.out.println(contador);
            contador++;
        }while (contador<=5);


        /////////////////Separador////////////////////
        System.out.println("------------------Separar-------------------");


        String[] ciudades ={"Cali","Bogota","Medellin"};

        System.out.println("Tamaño del arreglo "+ciudades.length);

        for(int i=0;i<ciudades.length;i+=2){
            System.out.println(ciudades[i]);
        }


        System.out.println("------------------FORI-------------------");
        for(String ciudad:ciudades){
            System.out.println(ciudad);
        }
        for(int i=1;i<101;i+=2){
            System.out.println(i);
        }
    }
}
