package com.vidhya.jpademo.st_models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue(value = "2")
public class ST_Mentor extends ST_User {
    private double avgRating;
}
