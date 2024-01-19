package com.ilp.services;

import com.ilp.interfaces.Rating;
import com.ilp.interfaces.TextReview;

public class OverallReview implements Rating, TextReview {

    @Override
    public void submitRating(double rating) {
        System.out.println("Rating submitted: " + rating);
    }

    @Override
    public void submitTextReview(String reviewText) {
        System.out.println("Text review submitted: " + reviewText);
    }
}
