package com.micro.ratings.controller;

import com.micro.ratings.entities.Rating;
import com.micro.ratings.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    //Create

    @PostMapping
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating){

        return new ResponseEntity<>(ratingService.createRating(rating), HttpStatus.CREATED);

    }

    //Get AllBy RatinId

    @GetMapping
    public ResponseEntity<List<Rating>> getAllRatings(){

        return new ResponseEntity<>(ratingService.getAllRating(), HttpStatus.OK);

    }


    //Get allBy restaurentId

    @GetMapping("/restaurent/{restaurentId}")
    public ResponseEntity<List<Rating>> getAllRatingByRestaurentId(@PathVariable  String restaurentId){

        return new ResponseEntity<>(ratingService.getRatingByRestaurentId(restaurentId), HttpStatus.OK);

    }

    //GetAllBy UserId

    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> getAllRatingByUserId(@PathVariable  String userId){

        return new ResponseEntity<>(ratingService.getRatingByUserId(userId), HttpStatus.OK);

    }



}
