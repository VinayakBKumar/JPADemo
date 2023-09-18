package com.vidhya.jpademo.st_models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue(value = "4")
public class ST_TA extends ST_User {
    private int startTime;
    private int endTime;
}
