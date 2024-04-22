package com.micro.MicroservicesProject.MicroservicesProject.services;

import com.micro.MicroservicesProject.MicroservicesProject.entities.Userinfo;

import java.util.List;

public interface UserService {

    //Insert User

    Userinfo insertUser(Userinfo userinfo);


    //GetAll the user

    List<Userinfo> getallUser();


    //Get user by id

    Userinfo getUserById(String userId);
}
