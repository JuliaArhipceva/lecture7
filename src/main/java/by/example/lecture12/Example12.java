package by.example.lecture12;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class Example12 {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        Instant instant = date.toInstant();
        System.out.println(instant);

        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        System.out.println(localDateTime);

        System.out.println("plus seconds: " + localDateTime.plusSeconds(30));
        System.out.println("plus minutes: " + localDateTime.plusMinutes(30));
        System.out.println("plus hours: " + localDateTime.plusHours(30));
        System.out.println("plus days: " + localDateTime.plusDays(30));
        System.out.println("plus months: " + localDateTime.plusMonths(30));

    }

    private static void showOldDate() {
        Date date = new Date();
        System.out.println("Date: " + date);
        System.out.println("Millis: " + date.getTime());
        Instant instant = date.toInstant();
        System.out.println("Instant: " + instant);

        Date date1 = new Date(86754736);
        System.out.println(date1);

        Date date2 = new Date(0x8000000000000000L);
        System.out.println(date2);

        Date date3 = new Date(date.getTime());
        System.out.println(date3);

        DateFormat dateFormat1 = new SimpleDateFormat("YY-MM-dd");
        DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss:SSS'Z'");
        DateFormat dateFormat3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        DateFormat dateFormat4 = new SimpleDateFormat("EEEE, dd MMMM yyyy");
        DateFormat dateFormat5 = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println(dateFormat1.format(date));
        System.out.println(dateFormat2.format(date));
        System.out.println(dateFormat3.format(date));
        System.out.println(dateFormat4.format(date));
        System.out.println(dateFormat5.format(date));

        System.out.println("month");
        Date januaryDate = new Date(1579737600);
        System.out.println(new SimpleDateFormat("MMMM").format(januaryDate)); // January
        System.out.println(new SimpleDateFormat("MMM").format(januaryDate)); // Jan
        System.out.println(new SimpleDateFormat("MM").format(januaryDate)); // 01
        System.out.println(new SimpleDateFormat("M").format(januaryDate)); // 1

        System.out.println(new SimpleDateFormat("Дата: dd.MM.YYYY, время: HH:mm:ss, день недели: EEEE").format(date));
    }

}
