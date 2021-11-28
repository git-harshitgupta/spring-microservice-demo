package com.app.moviecatelogservice.Dto;

import java.util.List;

public class UserRatingList {
	private List<Rating> ratings;
	
	

	public UserRatingList() {
		super();
	}

	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}
	

}
