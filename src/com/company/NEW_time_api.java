package com.company;

import  java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class NEW_time_api {

    public static void main(String[] args) {

//
//    LocalDate ld=LocalDate.now();
//        System.out.println(ld);
//
//
//        LocalTime lt=LocalTime.now();
//        System.out.println(lt);

        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("E");
        String myldt=ldt.format(dtf);

        System.out.println(myldt);

        System.out.println("------------");
        System.out.println(ldt.format(DateTimeFormatter.ISO_DATE));
        System.out.println(ldt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));


        System.out.println(myldt);

    }
}
