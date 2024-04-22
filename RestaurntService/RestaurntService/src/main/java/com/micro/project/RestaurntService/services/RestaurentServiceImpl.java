package com.micro.project.RestaurntService.services;

import com.micro.project.RestaurntService.entities.Restaurent;
import com.micro.project.RestaurntService.repository.RestaurentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@ComponentScan
@Service
public class RestaurentServiceImpl  implements  RestaurentService{

    @Autowired
    RestaurentRepo restaurentRepo;


    @Override
    public Restaurent insertAllRestaurent(Restaurent restaurent) {
        String randomRestaurentId = UUID.randomUUID().toString();
        restaurent.setRestaurentId(randomRestaurentId);
        return restaurentRepo.save(restaurent);
    }

    @Override
    public List<Restaurent> getallRestaurent() {
        return restaurentRepo.findAll();
    }

    @Override
    public Restaurent getRestaurentById(String RestaurentId) {
        return restaurentRepo.findById(RestaurentId).orElseThrow();
    }
}
