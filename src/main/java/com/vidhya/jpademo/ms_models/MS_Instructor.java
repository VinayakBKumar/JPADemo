package com.vidhya.jpademo.ms_models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class MS_Instructor extends MS_User {
    private double avgRating;
}
