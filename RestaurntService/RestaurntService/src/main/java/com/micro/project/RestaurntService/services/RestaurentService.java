package com.micro.project.RestaurntService.services;

import com.micro.project.RestaurntService.entities.Restaurent;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RestaurentService {


    //Create restaurent

    Restaurent insertAllRestaurent(Restaurent restaurent);


    //GetAllRestaurent Details

    List<Restaurent> getallRestaurent();


    //getById


    Restaurent getRestaurentById(String RestaurentId);
}
