package ClaseFinal;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateAndCalendar {
    public static void main(String[] args) {

        //JAVA 9 para abajo
        Date  fecha = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String fechaTransformada = format.format(fecha);
        System.out.println("fechaTransformada "+fechaTransformada);
        Calendar calendar = Calendar.getInstance();
        System.out.println("Calendar "+calendar);
        System.out.println("Date "+fecha);


        //Esto se utiliza en las verciones de 9 para arriba
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("LocalDateTime "+ldt);
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate "+localDate);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String localDateFormat = localDate.format(dtf);
        System.out.println("localDateFormat "+ localDateFormat);
        ////////////////////////////////////////////////////////
        LocalDate fechaHoy = LocalDate.now();
        LocalDate fechaCumpleanos = LocalDate.of(1992,9,29);

        Period period = Period.between(fechaCumpleanos,fechaHoy);

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

    }
}
