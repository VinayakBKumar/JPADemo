package com.vidhya.jpademo.tc_models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class TC_Instructor extends TC_User {
    private double avgRating;
}
