package com.company;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class DateTimeJava {


    public static void main(String[] args) {
        // date=> long => milli seconds from 1 jan 1970;
     //1990 se java ki duniya
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(System.currentTimeMillis());
//
//
        Date dt=new Date();
        System.out.println();
        System.out.println(dt.getTime());

        Calendar cal=Calendar.getInstance();

//        System.out.println(cal);
        System.out.println(cal.getCalendarType());
        System.out.println(cal.getTimeZone());
        System.out.println(cal.getTimeZone().toZoneId());
//        System.out.println(cal.setTimeZone(+5);

        GregorianCalendar gc=new GregorianCalendar();
        System.out.println(gc.isLeapYear(2024));





    }
}
