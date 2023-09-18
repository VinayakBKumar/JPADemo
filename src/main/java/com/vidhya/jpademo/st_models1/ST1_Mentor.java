package com.vidhya.jpademo.st_models1;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ST1_Mentor extends ST1_User {
    private double avgRating;
}
