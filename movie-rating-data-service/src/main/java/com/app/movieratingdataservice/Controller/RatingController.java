package com.app.movieratingdataservice.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.movieratingdataservice.Dto.Rating;
import com.app.movieratingdataservice.Dto.UserRatingList;

@RestController
@RequestMapping("/ratingdata")
public class RatingController {
	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") int movieId) {
		return new Rating(movieId,4);
	} 
	
	@RequestMapping("users/{userId}")
	public UserRatingList userRatingList() {
		List<Rating> ratings = Arrays.asList(new Rating(1234, 4),
				new Rating(5678, 3)
		);
		UserRatingList userRatingList=new UserRatingList();
		userRatingList.setRatings(ratings);
		return userRatingList;
	}
}
