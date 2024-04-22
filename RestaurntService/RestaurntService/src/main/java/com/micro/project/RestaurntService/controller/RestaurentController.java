package com.micro.project.RestaurntService.controller;

import com.micro.project.RestaurntService.entities.Restaurent;
import com.micro.project.RestaurntService.services.RestaurentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addrestaurent")
public class RestaurentController {

    @Autowired
    RestaurentService restaurentService;

    //create Restaurent

    @PostMapping
    public ResponseEntity<Restaurent> createRestaurent(@RequestBody Restaurent restaurent){

        return  new ResponseEntity<>(restaurentService.insertAllRestaurent(restaurent), HttpStatus.CREATED);

    }

    //GetAllRestaurentDetails

    @GetMapping("/GettAllRestaurentDetails")
    public  ResponseEntity<List<Restaurent>> getallRestaurent(){

        return new ResponseEntity<>(restaurentService.getallRestaurent(), HttpStatus.OK);
    }


    //GetAllById

    @GetMapping("/ById/{RestaurentId}")
    public  ResponseEntity<Restaurent> getByRestaurentId(@PathVariable String RestaurentId){

        return new ResponseEntity<>(restaurentService.getRestaurentById(RestaurentId), HttpStatus.OK);
    }


}
