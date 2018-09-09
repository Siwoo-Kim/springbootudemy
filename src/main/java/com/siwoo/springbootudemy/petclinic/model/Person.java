package com.siwoo.springbootudemy.petclinic.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;

/**
 * Created by sm123tt@gmail.com on 2018-09-09
 * Project : springbootudemy
 * Github : http://github.com/Siwoo-Kim
 */
@Entity @Getter @Setter @ToString
public class Person {

    private String firstName;
    private String lastName;


}
