package com.vidhya.jpademo.tc_models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class TC_Student extends TC_User{
    private int attendance;
}
