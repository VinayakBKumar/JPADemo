package com.vidhya.jpademo.ms_models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class MS_Student extends MS_User{
    private int attendance;
}
