package com.bridgelabz;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class HotelReservation  implements hotelReservationIF
{
    ArrayList<Hotel> hotelList = new ArrayList<Hotel>();
    Hotel hotel ;

    public void addHotel(String hotelName, int rating, double weekdayRate, double weekndRate) {
        hotel = new Hotel();
        hotel.setHotelName(hotelName);
        hotel.setRating(rating);
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

    public String getCheapestHotel(LocalDate startDate, LocalDate endDate) {

        int numberOfDays = (int) ChronoUnit.DAYS.between(startDate, endDate);
        int weekends = 0;

        while (startDate.compareTo(endDate) != 0) {
            switch (DayOfWeek.of(startDate.get(ChronoField.DAY_OF_WEEK))) {
                case SATURDAY:
                    ++weekends;
                    break;
                case SUNDAY:
                    ++weekends;
                    break;
            }
            startDate = startDate.plusDays(1);
        }

        final int weekdaysNumber = numberOfDays - weekends;
        final int weekendsNumber = weekends;

        int cheapestRate = (int) (hotelList.get(0).getWeekDayRate() + hotelList.get(0).getWeekendRate());
        String cheapestHotel=hotelList.get(0).getHotelName();
        for (Hotel hotel : hotelList) {
            int rateForHotel = (int) ((weekdaysNumber * hotel.getWeekDayRate())
                    + (weekendsNumber * hotel.getWeekendRate()));
            if (rateForHotel < cheapestRate) {
                cheapestRate = rateForHotel;
                cheapestHotel = hotel.getHotelName();
            }
        }


        System.out.println("Cheapest Hotel : \n" + cheapestHotel + ", Total Rates: " + cheapestRate);
        return cheapestHotel;

    }
}

