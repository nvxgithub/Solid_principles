package com.ilp.services;

import com.ilp.interfaces.ConvertRating;

public class RatingConverter implements ConvertRating{
	public void convertRating(double rating) {
        System.out.println("Converting rating with value: " + rating*20+"%");
    }
}
