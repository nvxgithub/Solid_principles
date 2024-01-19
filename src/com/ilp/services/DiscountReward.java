package com.ilp.services;

import com.ilp.interfaces.Reward;

public class DiscountReward implements Reward{
	private String name;
    private double discountPercentage;

    public DiscountReward(String name, double discountPercentage) {
        this.name = name;
        this.discountPercentage = discountPercentage;
    }

    @Override
    public boolean isRedeemable(int customerPoints) {
        return true;
    }

}
