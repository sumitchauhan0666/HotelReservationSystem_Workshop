package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservation  implements hotelReservationIF
{
    String hotelName;
    int rating;
    double regularCustomerRate;
    Scanner sc = new Scanner(System.in);
    ArrayList<Hotel> hotelList = new ArrayList<>();
    Hotel hotel;
    public void addHotel() {
        System.out.println("How many hotels you want to add");
        int numOfHotels = sc.nextInt();
        while(numOfHotels > 0) {
            System.out.println("Enter hotel name:");
            hotelName = sc.next();
            System.out.println("Enter hotel rating:");
            rating = sc.nextInt();
            System.out.println("Enter regular customer rate:");
            regularCustomerRate = sc.nextDouble();
            hotel = new Hotel(hotelName,rating,regularCustomerRate);
            hotelList.add(hotel);
            numOfHotels--;
        }
    }
    public int getHotelListSize() {
        return hotelList.size();
    }

    public void printHotelList() {
        System.out.println(hotelList);
    }
}