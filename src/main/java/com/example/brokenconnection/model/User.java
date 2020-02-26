package com.example.brokenconnection.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@NoArgsConstructor
@Setter
@Getter
@Table(name = "USERS")
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

}
