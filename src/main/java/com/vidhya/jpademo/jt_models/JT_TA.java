package com.vidhya.jpademo.jt_models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class JT_TA extends JT_User{
    private int startTime;
    private int endTime;
}
