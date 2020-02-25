package com.tzkinformatics.measapp.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@Getter
@Setter
public class UserEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String userName;
    private String emailAddress;
    private String location;
    private boolean isAdmin;
    private boolean isExecutor;

}
