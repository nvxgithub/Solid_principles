package com.ilp.entity;

class PointReward extends Reward {
   
    private int requiredPoints;


    public PointReward(String rewardName, int requiredPoints) {

        super(rewardName);
        this.requiredPoints = requiredPoints;
    }

    public boolean isRedeemable(int customerPoints) {
        return customerPoints >= requiredPoints;
    }
}