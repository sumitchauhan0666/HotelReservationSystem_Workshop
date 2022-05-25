package com.bridgelabz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class hotelReservationMainTest
{

    @Test
    public void givenHotelList_WhenAdded_shouldReturnProperHotelName(){
        hotelReservationIF hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Bridgewood", 4, 110,90);
        String hotelName = hotelReservation.getHotelList().get(0).getHotelName();
        assertEquals("Bridgewood", hotelName);
    }

    @Test
    public void givenHotelList_WhenAdded_shouldReturnProperHotelRating(){
        hotelReservationIF hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Bridgewood", 4, 150,50);
        int hotelRating = hotelReservation.getHotelList().get(0).getRate();
        assertEquals(4, hotelRating);
    }

    @Test
    public void givenHotelList_WhenAdded_shouldReturnWeekDayRate(){
        hotelReservationIF hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Bridgewood", 4, 150,50);
        int weekDayRate = (int) hotelReservation.getHotelList().get(0).getWeekDayRate();
        assertEquals(150, weekDayRate);
    }
    @Test
    public void givenHotelList_WhenAdded_shouldReturnWeekendRate(){
        hotelReservationIF hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Bridgewood", 4, 220,150);
        int weekendRate = (int) hotelReservation.getHotelList().get(0).getWeekendRate();
        assertEquals(150, weekendRate);
    }
    @Test
    public void givenHotelDetails_WhenSizeMatches_ShouldReturnTrue()
    {
        hotelReservationIF hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Lakewood", 3, 110,90);
        hotelReservation.addHotel("Bridgewood", 4, 150,50);
        hotelReservation.addHotel("Ridgewood", 5, 220,150);
        int hotelListSize = hotelReservation.getHotelListSize();
        assertEquals(3, hotelListSize);
    }

}