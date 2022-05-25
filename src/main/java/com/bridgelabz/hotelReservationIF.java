package com.bridgelabz;

import java.time.LocalDate;
import java.util.ArrayList;

public interface hotelReservationIF
{
    public void addHotel(String hotelName,int rating, double weekDayRate,double weekendRate,double weekdayRewardCustomerRate,double weekendRewardCustomerRate);
    public int getHotelListSize();
    public void printHotelList();
    public ArrayList<Hotel> getHotelList();
    public String getCheapestHotel(LocalDate startDate, LocalDate endDate);
    public String getBestRatedHotel(LocalDate startDate, LocalDate endDate);

}
