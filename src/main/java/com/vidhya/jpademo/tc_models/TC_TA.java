package com.vidhya.jpademo.tc_models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class TC_TA extends TC_User{
    private int startTime;
    private int endTime;
}
