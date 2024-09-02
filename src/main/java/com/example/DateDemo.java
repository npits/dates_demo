package com.example;

/**
 * Why prefer the new Date/Time APIs - java.time over the old java.util.Date?
 * The new java date api (java.time) can:
 * - simplify time-zone/date-format handling logic and other day-to-day operations.
 * - handle concurrency issues since the new Date and Time APIs are immutable, thus thread-safe.
 */

public class DateDemo {

    //thread safety demonstration
    public static void makeThreadSafe(){

    }

    //time-zone handling
    public static void handleTimeZones(){

    }

    //parsing-formatting dates
    public static void parseFormatDates(){

    }

    //manipulating dates with java.util.date often involves using Calendar class which makes things complex and affects code readability
    //while with LocalDate/LocalDateTime things are easier since they are provided with in-built methods for date manipulating
    public static void createDate(){

    }
    public static void main(String[] args){

       //makeThreadSafe();
       //handleTimeZones();
       //parseFormatDates();
       //createDate();
    }

}
