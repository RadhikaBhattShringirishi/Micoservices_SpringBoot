package com.micro.MicroservicesProject.MicroservicesProject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "userinfo")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Userinfo {

    @Id
    private String userId;

    @Column(name = "name")
    private String name;

    private String email;

    private String password;

    @Transient
    private List<Rating> ratings = new ArrayList<>();


}
