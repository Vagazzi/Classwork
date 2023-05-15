package tms.vagazzi.lesson_14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class DateMain {
    public static void main(String[] args) {
        LocalDateTime time;
        LocalDate date;
        Date oldDate;
        Calendar calendar;

        date = LocalDate.now();
        time = LocalDateTime.now();

        System.out.println(date);
        System.out.println(time);

        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfYear());
    }
}
