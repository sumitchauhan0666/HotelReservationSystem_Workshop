package com.bridgelabz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class hotelReservationMainTest {

        @Test
        public void shouldAnswerWithTrue()
        {
            assertTrue( true );
        }
        @Test
        public void givenHotelDetails_WhenSizeMatches_ShouldReturnTrue()
        {
            hotelReservationIF hotelReservation = new HotelReservation();
            hotelReservation.addHotel();
            int hotelListSize = hotelReservation.getHotelListSize();
            System.out.println("" +hotelListSize);
            assertEquals(0, hotelListSize);
        }
    }