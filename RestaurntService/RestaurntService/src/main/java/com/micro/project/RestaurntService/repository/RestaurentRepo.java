package com.micro.project.RestaurntService.repository;

import com.micro.project.RestaurntService.entities.Restaurent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurentRepo extends JpaRepository<Restaurent, String> {
    //custom methods
}
