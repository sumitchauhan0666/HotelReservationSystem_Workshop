package com.bridgelabz;
import java.util.ArrayList;

public class HotelReservation  implements hotelReservationIF
{
    ArrayList<Hotel> hotelList = new ArrayList<>();
    Hotel hotel;

    public void addHotel(String hotelName, int rate, double weekdayRate, double weekndRate) {
        hotel = new Hotel();
        hotel.setHotelName(hotelName);
        hotel.setRate(rate);
        hotel.setWeekDayRate(weekdayRate);
        hotel.setWeekendRate(weekndRate);
        hotelList.add(hotel);
    }

    public int getHotelListSize() {
        return hotelList.size();
    }

    public void printHotelList() {
        System.out.println(hotelList);
    }

    public ArrayList<Hotel> getHotelList(){
        return hotelList;
    }

}

