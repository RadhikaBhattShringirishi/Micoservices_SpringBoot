package com.micro.ratings.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "users_ratings")
public class Rating {

    @Id
    private String ratingId;

    private String userId;

    private String ratingStars;

    private String restaurentId;

    private  String remarks;


}
