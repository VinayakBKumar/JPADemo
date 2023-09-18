package com.vidhya.jpademo.jt_models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class JT_Mentor extends JT_User{
    private double avgRating;
}
