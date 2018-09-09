package com.siwoo.springbootudemy.petclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * Created by sm123tt@gmail.com on 2018-09-09
 * Project : springbootudemy
 * Github : http://github.com/Siwoo-Kim
 */

@Getter @Setter
public class Pet {

    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;


}
