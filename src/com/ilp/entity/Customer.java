package com.ilp.entity;

public class Customer {
    private String name;
    private int loyaltyPoints;

    public Customer(String name) {
        this.name = name;
        this.loyaltyPoints = 0;
    }

    public void earnLoyaltyPoints(int points) {
        this.loyaltyPoints += points;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

}
