package com.vidhya.jpademo.st_models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@DiscriminatorValue(value = "1")
public class ST_Instructor extends ST_User {
    private double avgRating;
}
