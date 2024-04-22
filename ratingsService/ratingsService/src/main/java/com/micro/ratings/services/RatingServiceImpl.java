package com.micro.ratings.services;

import com.micro.ratings.entities.Rating;
import com.micro.ratings.repositories.RatingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService{

    @Autowired
    private RatingRepo ratingRepo;

    @Override
    public Rating createRating(Rating rating) {

        return ratingRepo.save(rating);
    }

    @Override
    public List<Rating> getRatingByUserId(String userId) {
        return ratingRepo.findByUserId(userId) ;
    }

    @Override
    public List<Rating> getRatingByRestaurentId(String restaurentId) {
        return ratingRepo.findByRestaurentId(restaurentId);
    }

    @Override
    public List<Rating> getAllRating() {
        return ratingRepo.findAll();
    }
}
