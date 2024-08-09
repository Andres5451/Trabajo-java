package Clase5;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger=Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {

//      Perro p = new Perro("Milo");
//      p.emitirSonido();
//      p.tieneSangre=true;

        try{

            int numerador=10;
            int denominador = 0;

            if(denominador==0){
              throw new RuntimeException("El denominador no puede ser 0");
            }
            double resultado = 10/0;
        }catch (RuntimeException e){
            System.out.println("Fallo por: "+e.getMessage());
        }

        System.out.println("TERMINE DE FORMA CORRECTA");














        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


       numbers.stream()
                .filter(n-> n%2==0)
                .map(n-> n*2).forEach(System.out::println);




        List<Product> products = Arrays.asList(
                new Product("Laptop", 1200.00),
                new Product("Mouse", 25.00),
                new Product("Keyboard", 75.00),
                new Product("Monitor", 300.00),
                new Product("USB Drive", 15.00)
        );


        double total = products.stream()
                .filter(p-> p.price >50)
                .peek(p-> logger.info("Productos filtrados "+p))
                .map(p -> new Product(p.name,p.price*0.9))
                .peek(p-> logger.info("Productos con descuento "+p))
                .mapToDouble(p->p.price)
                .sum();

        logger.info("El resultado es " +total);























    }
}
