package com.vidhya.jpademo.st_models1;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class ST1_User extends ST1_BaseModel {
    private String name;
}



