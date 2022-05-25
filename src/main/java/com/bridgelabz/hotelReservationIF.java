package com.bridgelabz;
import java.util.ArrayList;

public interface hotelReservationIF
{
    public void addHotel(String hotelName,int rate, double regularCustomerRate);
    public int getHotelListSize();
    public void printHotelList();
    public ArrayList<Hotel> getHotelList();
}

