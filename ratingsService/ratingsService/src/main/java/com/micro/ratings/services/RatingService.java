package com.micro.ratings.services;

import com.micro.ratings.entities.Rating;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RatingService {

    //Create Rating service

    Rating createRating(Rating rating);

    //Get AllBy UserId

    List<Rating> getRatingByUserId(String userId);

    // Get All By RestaurentId

    List<Rating> getRatingByRestaurentId(String restaurentId);

    //Get All Rating

    List<Rating> getAllRating();
}
