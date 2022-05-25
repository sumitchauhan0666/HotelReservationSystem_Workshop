package com.bridgelabz;

public class Hotel
{

    private String hotelName;
    private int rate;
    private double regularCustomerCost;
    public Hotel() {
    }

    public Hotel(String hotelName, int rate, double regularCustomerCost) {
        this.hotelName = hotelName;
        this.rate = rate;
        this.regularCustomerCost = regularCustomerCost;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public double getRegularCustomerCost() {
        return regularCustomerCost;
    }

    public void setRegularCustomerCost(double regularCustomerCost) {
        this.regularCustomerCost = regularCustomerCost;
    }

    @Override
    public String toString() {
        return "Hotel [hotelName=" + hotelName + ", rating=" + rate + ", regularCustomerCost=" + regularCustomerCost
                + "]";
    }


}