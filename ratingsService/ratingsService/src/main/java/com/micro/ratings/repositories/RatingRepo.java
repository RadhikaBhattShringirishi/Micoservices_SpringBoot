package com.micro.ratings.repositories;

import com.micro.ratings.entities.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepo extends MongoRepository<Rating,String> {

    //Custom methods
    List<Rating> findByUserId(String userId);

    List<Rating> findByRestaurentId(String restaurentId);
}
