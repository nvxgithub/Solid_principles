package com.ilp.services;

import com.ilp.interfaces.Reward;

public class PointReward implements Reward {
    private String name;
    private int requiredPoints;

    public PointReward(String name, int requiredPoints) {
        this.name = name;
        this.requiredPoints = requiredPoints;
    }

    @Override
    public boolean isRedeemable(int customerPoints) {
        return customerPoints >= requiredPoints;
    }
}