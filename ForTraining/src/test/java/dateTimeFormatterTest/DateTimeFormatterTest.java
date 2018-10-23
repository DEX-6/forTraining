package dateTimeFormatterTest;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterTest {
    public static void main(String[] args) {
        String date = "2016-08-16";

        //default, ISO_LOCAL_DATE
        LocalDate localDate = LocalDate.parse(date);

        System.out.println(localDate);

    }
}
