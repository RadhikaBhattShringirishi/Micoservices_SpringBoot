package com.micro.MicroservicesProject.MicroservicesProject.services;

import com.micro.MicroservicesProject.MicroservicesProject.entities.Rating;
import com.micro.MicroservicesProject.MicroservicesProject.entities.Restaurent;
import com.micro.MicroservicesProject.MicroservicesProject.entities.Userinfo;
import com.micro.MicroservicesProject.MicroservicesProject.exception.ResourcenotFoundException;
import com.micro.MicroservicesProject.MicroservicesProject.repositories.UserRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserServiceimpl implements  UserService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    RestTemplate restTemplate;

    private Logger logger= LoggerFactory.getLogger(UserServiceimpl.class);

    @Override
    public Userinfo insertUser(Userinfo userinfo) {
        //Unique generation of UserId
        String randomUserId = UUID.randomUUID().toString();
        userinfo.setUserId(randomUserId);
        return userRepo.save(userinfo);
    }

    @Override
    public List<Userinfo> getallUser() {

        return userRepo.findAll();
    }

    @Override
    public Userinfo getUserById(String userId) {
        Userinfo userinfo =  userRepo.findById(userId).orElseThrow(() -> new ResourcenotFoundException("user with given id is not present"+ userId));
        //Fetching ratings of the given user id
        //Rating object recieved by getForObject Method
        Rating[] ratingsOfUsers = restTemplate.getForObject("http://RATING-SERVICE/ratings/users/"+userinfo.getUserId(), Rating[].class);
        logger.info("{}",ratingsOfUsers);
        List<Rating> ratings = Arrays.stream(ratingsOfUsers).toList();
        List<Rating> ratingList = ratings.stream().map(rating -> {

            System.out.println(rating.getRestaurentId());

            ResponseEntity<Restaurent> forEntity = restTemplate.getForEntity("http://RESTAURENT-SERVICE/addrestaurent/"+rating.getRestaurentId(),Restaurent.class);

            Restaurent restaurent = forEntity.getBody();
            logger.info("response status code : {} ",forEntity.getStatusCode());
            //set the rating to Restaurent
            rating.setRestaurent(restaurent);

            //Return the rating
            return rating;
        }).collect(Collectors.toList());

        //set Ratings to Users
        userinfo.setRatings(ratingList);

        return userinfo;
    }
}
