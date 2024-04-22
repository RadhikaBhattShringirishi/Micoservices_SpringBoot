package com.micro.MicroservicesProject.MicroservicesProject.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rating {

    private String ratingId;

    private String userId;

    private String ratingStars;

    private String restaurentId;

    private  String remarks;

    //Rating has the reference of Restaurent Class
    private Restaurent restaurent;


}
