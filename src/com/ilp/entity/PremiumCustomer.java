package com.ilp.entity;

public class PremiumCustomer extends Customer {
	public PremiumCustomer(String name) {
        super(name);
    }
public void earnDoubleLoyaltyPoints(int points) {
        this.earnLoyaltyPoints(points*2);
    }
}
