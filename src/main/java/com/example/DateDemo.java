package com.example;

import com.aayushatharva.brotli4j.common.annotations.Local;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Why prefer the new Date/Time APIs - java.time over the old java.util.Date?
 * The new java date api (java.time) can:
 * - simplify time-zone/date-format handling logic and other day-to-day operations.
 * - handle concurrency issues since the new Date and Time APIs are immutable, thus thread-safe.
 */

public class DateDemo {

    //immutability demonstration
    public static void makeThreadSafe(){
        //java.uti.date
        Date date = new Date();
        System.out.println("Original date: " + date);
        System.out.println("Original date modified: " + date + "\n");

        //java.time.LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Original date: " + localDateTime);
        LocalDateTime newlocalDateTime = localDateTime.plusDays(1);
        System.out.println("Original date unmodified: " + localDateTime);
        System.out.println("New date modified: " + newlocalDateTime);
    }

    //time-zone handling
    public static void handleTimeZones(){
        //java.util.date
        //Timezones can be handled only using Calendar class and not Date
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        System.out.println("Time in London: " + calendar.getTime() + "\n");

        //java.time
        //calculate time with zone efficiently
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/London"));
        System.out.println("Time in London: " + zonedDateTime);

    }

    //parsing-formatting dates
    public static void parseFormatDates() throws ParseException {
        //java.util
        //- to format dates, SimpleDateFormat is needed which is not thread-safe and can cause concurrency issues
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = formatter.parse("02/09/2024");
        System.out.println("Formatted Date with SimpleDateFormat: " + formatter.format(date));

        //java.time
        //more clean, and thread-safe
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse("02/09/2024", dateTimeFormatter);
        System.out.println("Formatted Date with DateTimeFormatter: " + localDate.format(dateTimeFormatter));

    }

    //manipulating dates with java.util.date often involves using Calendar class which makes things complex and affects code readability
    //while with LocalDate/LocalDateTime things are easier since they are provided with in-built methods for date manipulating
    public static void createDate(){
        //java.util
        Calendar calendar = Calendar.getInstance();
        calendar.set(2024, Calendar.SEPTEMBER, 2);  // Months are 0-based - not convenient
        System.out.println("Date is: " + calendar.getTime() + "\n");

        //java.time
        LocalDateTime localDateTime = LocalDateTime.of(2024,9,14,16,30);
        System.out.println("Date is: " + localDateTime);
    }

    }

    //java.time  Instant class - helpful
    public static void main(String[] args) throws ParseException {

       //makeThreadSafe();
       //handleTimeZones();
       //parseFormatDates();
       //createDate();
        instantDates();
    }

}
