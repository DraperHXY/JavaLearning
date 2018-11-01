package com.draper.date;


import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class First {

    public static void main(String[] args) {

        System.out.println(new Timestamp(System.currentTimeMillis()));
        System.out.println(new Timestamp(new Date().getTime()));
        System.out.println(new Timestamp(System.currentTimeMillis()));
        System.out.println(System.currentTimeMillis());
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp.getTime());

        Instant instant = Instant.now();
        System.out.println(instant);

        Date someDate = new Date();
        System.out.println("someDate = " + someDate);

        Instant someInstant = someDate.toInstant();
        System.out.println("someInstant = " + someInstant);

        someInstant = Instant.ofEpochMilli(someDate.getTime());
        System.out.println("someInstant = " + someInstant);

        Calendar.Builder calendarBuilder = new Calendar.Builder();
        Calendar calendar = calendarBuilder.build();

        calendar.setTime(someDate);
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH) + 1);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));
        System.out.println(calendar.get(Calendar.MILLISECOND));

        SimpleDateFormat format = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println(format.format(someDate));

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

    }


}
