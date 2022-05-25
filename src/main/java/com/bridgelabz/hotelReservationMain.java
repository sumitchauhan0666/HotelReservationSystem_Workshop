package com.bridgelabz;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class hotelReservationMain
{
    public static void main(String[] args)
    {
        System.out.println("Hotel Reservation System::");
        hotelReservationIF hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Lakewood", 3, 110,90);
        hotelReservation.addHotel("Bridgewood", 4, 150,50);
        hotelReservation.addHotel("Ridgewood", 5, 220,150);
        hotelReservation.printHotelList();
        LocalDate startDate = LocalDate.of(2021, Month.SEPTEMBER, 10);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd ' start date 'MMMM yyyy");
        System.out.println(startDate.format(dateTimeFormatter));
        LocalDate endDate = LocalDate.of(2021, Month.SEPTEMBER, 11);
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd ' end date 'MMMM yyyy");
        System.out.println(endDate.format(dateTimeFormatter1));
        hotelReservation.getCheapestHotel(startDate, endDate);
    }
}

