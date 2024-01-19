package com.ilp.services;

import com.ilp.interfaces.ConvertRating;

public class ReviewService {
    private ConvertRating ratingConverter;

    public ReviewService(ConvertRating ratingConverter) {
        this.ratingConverter = ratingConverter;
    }

    public void convertRating(double rating) {
        ratingConverter.convertRating(rating);
    }
}
