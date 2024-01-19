package com.ilp.services;

import com.ilp.interfaces.Rating;

public class RatingOnlyReview implements Rating{
    @Override
    public void submitRating(double rating) {
        System.out.println("Only Rating submitted: " + rating);
    }
}