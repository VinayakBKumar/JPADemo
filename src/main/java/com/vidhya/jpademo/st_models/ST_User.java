package com.vidhya.jpademo.st_models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn( discriminatorType = DiscriminatorType.INTEGER)
public class ST_User {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String email;
}
