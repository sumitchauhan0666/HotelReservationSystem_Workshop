package com.bridgelabz;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class hotelReservationMainTest
{
    @Test
    public void givenHotelList_WhenAdded_shouldReturnProperHotelName(){
        hotelReservationIF hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Bridgewood", 4, 110,90,110,50);
        String hotelName = hotelReservation.getHotelList().get(0).getHotelName();
        assertEquals("Bridgewood", hotelName);
    }
    @Test
    public void givenHotelList_WhenAdded_shouldReturnProperHotelRating(){
        hotelReservationIF hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Bridgewood", 4, 150,50,110,50);
        int hotelRating = hotelReservation.getHotelList().get(0).getRating();
        assertEquals(4, hotelRating);
    }
    @Test
    public void givenHotelList_WhenAdded_shouldReturnWeekDayRate(){
        hotelReservationIF hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Bridgewood", 4, 150,50,110,50);
        int weekDayRate = (int) hotelReservation.getHotelList().get(0).getWeekDayRate();
        assertEquals(150, weekDayRate);
    }
    @Test
    public void givenHotelList_WhenAdded_shouldReturnWeekendRate(){
        hotelReservationIF hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Bridgewood", 4, 220,150,110,50);
        int weekendRate = (int) hotelReservation.getHotelList().get(0).getWeekendRate();
        assertEquals(150, weekendRate);
    }
    @Test
    public void givenHotelList_WhenAdded_shouldReturnWeekDayRewardRate(){
        hotelReservationIF hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Bridgewood", 4, 150,50,110,50);
        int weekdayRewardRate = (int) hotelReservation.getHotelList().get(0).getWeekdayRewardCustomerRate();
        assertEquals(110, weekdayRewardRate);
    }
    @Test
    public void givenHotelList_WhenAdded_shouldReturnWeekendRewardRate(){
        hotelReservationIF hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Bridgewood", 4, 220,150,110,50);
        int weekendRewardRate = (int) hotelReservation.getHotelList().get(0).getWeekendRewardCustomerRate();
        assertEquals(50, weekendRewardRate);
    }
    @Test
    public void givenHotelDetails_WhenSizeMatches_ShouldReturnTrue()
    {
        hotelReservationIF hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Lakewood", 3, 110,90,80,80);
        hotelReservation.addHotel("Bridgewood", 4, 150,50,110,50);
        hotelReservation.addHotel("Ridgewood", 5, 220,150,100,140);
        int hotelListSize = hotelReservation.getHotelListSize();
        assertEquals(3, hotelListSize);
    }
    @Test
    public void givenHotelDetails_shouldReturnCheapestHotel(){

        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Lakewood", 3, 110, 90,80,80);
        hotelReservation.addHotel("Bridgewood", 4, 160, 50,110,50);
        LocalDate startDate = LocalDate.of(2020, Month.SEPTEMBER, 10);
        LocalDate endDate = LocalDate.of(2020, Month.SEPTEMBER, 12);
        String hotelName = hotelReservation.getCheapestHotel(startDate, endDate,"reward");
        assertEquals("Bridgewood", hotelName);
    }
    @Test
    public void givenHotelDetails_shouldReturnBestRatedHotel(){

        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Lakewood", 3, 110, 90,80,80);
        hotelReservation.addHotel("Bridgewood", 4, 160, 50,110,50);
        LocalDate startDate = LocalDate.of(2020, Month.SEPTEMBER, 10);
        LocalDate endDate = LocalDate.of(2020, Month.SEPTEMBER, 12);
        String hotelName = hotelReservation.getBestRatedHotel(startDate, endDate);
        assertEquals("Bridgewood", hotelName);
    }
    @Test
    public void givenHotelDetails_WhenNull_ShouldThrowHotelReservationException() {


        try {
            HotelReservation hotelReservation = new HotelReservation();
            hotelReservation.addHotel("Lakewood", 3, 110, 90, 80, 80);
            hotelReservation.addHotel("Bridgewood", 4, 150, 50, 110, 50);
            hotelReservation.addHotel("Ridgewood", 5, 220, 150, 100, 40);
            LocalDate startDate = LocalDate.of(2020, Month.SEPTEMBER, 11);
            LocalDate endDate = LocalDate.of(2020, Month.SEPTEMBER, 12);
            hotelReservation.getCheapestHotel(startDate, endDate,null);
        }
        catch(HotelReservationException e){
            assertEquals(HotelReservationException.ExceptionType.ENTERED_NULL, e.type);
            e.printStackTrace();
        }
    }
    @Test
    public void givenHotelDetails_WhenEmpty_ShouldThrowHotelReservationException() {


        try {
            HotelReservation hotelReservation = new HotelReservation();
            hotelReservation.addHotel("Lakewood", 3, 110, 90, 80, 80);
            hotelReservation.addHotel("Bridgewood", 4, 150, 50, 110, 50);
            hotelReservation.addHotel("Ridgewood", 5, 220, 150, 100, 40);
            LocalDate startDate = LocalDate.of(2020, Month.SEPTEMBER, 11);
            LocalDate endDate = LocalDate.of(2020, Month.SEPTEMBER, 12);
            hotelReservation.getCheapestHotel(startDate, endDate,"");
        }
        catch(HotelReservationException e){
            assertEquals(HotelReservationException.ExceptionType.ENTERED_EMPTY, e.type);
            e.printStackTrace();
        }

    }
}

