package com.example;

import com.aayushatharva.brotli4j.common.annotations.Local;

import java.time.LocalDateTime;
import java.util.Date;

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
        date.setTime(10000L);
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

    }

    //parsing-formatting dates
    public static void parseFormatDates(){

    }

    //manipulating dates with java.util.date often involves using Calendar class which makes things complex and affects code readability
    //while with LocalDate/LocalDateTime things are easier since they are provided with in-built methods for date manipulating
    public static void createDate(){

    }

    //java.time  Instant class - helpful
    public static void main(String[] args){

       makeThreadSafe();
       //handleTimeZones();
       //parseFormatDates();
       //createDate();
    }

}
