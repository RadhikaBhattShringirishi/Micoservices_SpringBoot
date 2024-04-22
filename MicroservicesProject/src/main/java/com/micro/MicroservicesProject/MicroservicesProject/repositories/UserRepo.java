package com.micro.MicroservicesProject.MicroservicesProject.repositories;

import com.micro.MicroservicesProject.MicroservicesProject.entities.Userinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Userinfo, String> {
}
