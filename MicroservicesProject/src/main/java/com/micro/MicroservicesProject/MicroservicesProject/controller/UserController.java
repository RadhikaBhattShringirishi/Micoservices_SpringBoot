package com.micro.MicroservicesProject.MicroservicesProject.controller;

import com.micro.MicroservicesProject.MicroservicesProject.entities.Userinfo;
import com.micro.MicroservicesProject.MicroservicesProject.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    //create UserDeatails

    @PostMapping
    public ResponseEntity<Userinfo> createUser(@RequestBody Userinfo userinfo){

        Userinfo user1 = userService.insertUser(userinfo);

        return new ResponseEntity<>(user1, HttpStatus.CREATED);

    }


    //Get all users
    @GetMapping("/GetAllUser")
    public ResponseEntity<List<Userinfo>> getAllUser(){

        return new ResponseEntity<>(userService.getallUser(), HttpStatus.OK);

    }



//    get user by userId

    @GetMapping("/{userId}")
    public ResponseEntity<Userinfo> getByUserId( @PathVariable String userId){

        return new ResponseEntity<>(userService.getUserById(userId), HttpStatus.OK);

    }


}
