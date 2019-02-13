package dateTimeFormatterTest;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest {

    @Test
//    Parse date localDate format
    public void example_1() {
        String date = "2016-08-16";
        //default, ISO_LOCAL_DATE
        LocalDate localDate = LocalDate.parse(date);
        System.out.println(localDate);

    }

    @Test
//    Parse date from "d-MMM-yyyy" pattern
    public void example_2() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLL yyyy");
        String date = "16 Jul 2016";
        LocalDate localDate = LocalDate.parse(date, formatter);
        System.out.println(localDate);  //default, print ISO_LOCAL_DATE
        System.out.println(formatter.format(localDate));

//        String date1 ="01-Jan-2017";
//        String date2 = "02-Feb-2017";
//
//        DateTimeFormatter df = DateTimeFormatter.ofPattern("d-MMM-yyyy");
//        LocalDate  d1 = LocalDate.parse(date1, df);
//        LocalDate  d2 = LocalDate.parse(date2, df);
//
//        Long datediff = ChronoUnit.DAYS.between(d1,d2);
//        System.out.println(d1);
//        System.out.println(d2);
//        System.out.println(datediff);
    }

    @Test
    public void example_3() {
        String fecha = "04/10/2018";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(fecha, formatter);
        ZonedDateTime resultado = date.atStartOfDay(ZoneId.systemDefault());
        System.out.println(date);
        System.out.println(resultado);
    }

    @Test
    public void example_4() {
//        String date = "2018-10-03 12:12:33";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String date = "2018-10-03 12:12:33";

        String formattedDate = date.split("\\.[\\d]{3}")[0];
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(formattedDate, formatter);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, ZoneOffset.ofHours(3));
        System.out.println(offsetDateTime);
//        LocalDate localDate = LocalDate.parse(date, formatter);
//        System.out.println(localDate);
    }

    @Test
    public void example_5() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssx:00");
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println(offsetDateTime);
        System.out.println(formatter.format(offsetDateTime));
    }
}
