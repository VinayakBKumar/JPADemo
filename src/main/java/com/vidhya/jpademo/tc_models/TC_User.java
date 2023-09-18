package com.vidhya.jpademo.tc_models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class TC_User {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String email;
}
