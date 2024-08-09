package Clase5;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogsTest {

    private static final Logger logger=Logger.getLogger(LogsTest.class.getName());
    public static void main(String[] args) {
        logger.info("Aplicación iniciada");
        System.out.println("Aplicación iniciada");
        try {
            int result = divide(10, 0);
            logger.info("Resultado: " + result);
        } catch (ArithmeticException e) {
            logger.log(Level.SEVERE, "Error de división: ", e);
        }

        logger.info("Aplicación finalizada");
    }

    public static int divide(int a, int b) {
        logger.info("Dividiendo " + a + " por " + b);
        return a / b;
    }
}
