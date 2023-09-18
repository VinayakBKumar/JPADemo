package com.vidhya.jpademo.ms_models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class MS_TA extends MS_User{
    private int startTime;
    private int endTime;
}
