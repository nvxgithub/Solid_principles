package com.ilp.utility;

import com.ilp.services.DiscountReward;
import com.ilp.services.OverallReview;
import com.ilp.services.RatingOnlyReview;
import com.ilp.services.RatingConverter;
import com.ilp.services.ReviewService;
import com.ilp.interfaces.ConvertRating;
import com.ilp.entity.Customer;
import com.ilp.entity.PremiumCustomer;


public class RewardReviewUtility {

	public static void main(String[] args) {
		Customer customer=new PremiumCustomer("Nebil");
		customer.earnLoyaltyPoints(100);
		System.out.println("Loyalty points:"+customer.getLoyaltyPoints());
		
	  
	     OverallReview overallReview=new OverallReview();
	     RatingOnlyReview ratingOnlyReview=new RatingOnlyReview();
		     overallReview.submitRating(3);
		     overallReview.submitTextReview("Great Experience");
		     ratingOnlyReview.submitRating(4.7);
		 
	    
	     ConvertRating ratingConverter = new RatingConverter();
	     ReviewService reviewService = new ReviewService(ratingConverter);

		        reviewService.convertRating(4.7);
	      
	}

}
