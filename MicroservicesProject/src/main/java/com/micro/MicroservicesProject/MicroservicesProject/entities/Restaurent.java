package com.micro.MicroservicesProject.MicroservicesProject.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Restaurent {

    private String RestaurentId;

    private String name;

    private String location;

    private String about;
}
