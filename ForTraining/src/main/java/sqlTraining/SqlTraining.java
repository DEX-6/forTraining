package sqlTraining;

import java.sql.Date;

public class SqlTraining {


    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread();
        Date date1 = new Date(System.currentTimeMillis());
        thread.sleep(1000);
        Date date2 = new Date(System.currentTimeMillis());
        System.out.printf("date1: %s\n", date1);
        System.out.printf("date2: %s\n", date2);
        if (date1.compareTo(date1) == 0) {
            System.out.printf("date1 and date1 are equal, date1 = %s, date1 = %s\n", date1.getTime(), date1.getTime());
        } else {
            System.out.printf("date1 and date1 aren't equal, date1 = %s, date1 = %s\n", date1.getTime(), date1.getTime());
        }

        if (date1.compareTo(date2) == 0) {
            System.out.printf("date1 and date2 are equal, date1 = %s, date2 = %s\n", date1.getTime(), date2.getTime());
        } else {
            System.out.printf("date1 and date2 aren't equal, date1 = %s, date2 = %s\n", date1.getTime(), date2.getTime());
        }
    }


}
