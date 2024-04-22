package com.micro.project.RestaurntService.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name="Restaurent")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Restaurent {

    @Id
    private String RestaurentId;

    private String name;

    private String location;

    private String about;
}
