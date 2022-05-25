package com.bridgelabz;

public class hotelReservationMain
{
    public static void main(String[] args) {
        System.out.println("Hotel Reservation System");
        hotelReservationIF hotelReservation = new HotelReservation();
        hotelReservation.addHotel();
        hotelReservation.printHotelList();
    }
}