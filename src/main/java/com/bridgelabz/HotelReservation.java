package com.bridgelabz;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class HotelReservation  implements hotelReservationIF
{
    ArrayList<Hotel> hotelList = new ArrayList<>();
    Hotel hotel;

    public void addHotel(String hotelName, int rate, double regularCustomerRate) {
        hotel = new Hotel();
        hotel.setHotelName(hotelName);
        hotel.setRate(rate);
        hotel.setRegularCustomerCost(regularCustomerRate);
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

    public Hotel getCheapestHotel(LocalDate startDate, LocalDate endDate) {
        //here i am using stream API
        Optional<Hotel> resultList = hotelList.stream().min(Comparator.comparing(Hotel::getRegularCustomerCost));
        return resultList.get();
    }
}

