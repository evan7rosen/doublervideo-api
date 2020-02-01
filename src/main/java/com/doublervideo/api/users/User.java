package com.doublervideo.api.users;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "users")
@Data

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private String username;

    @Column
    private String email;

    @Column
    private String password;

    public User() {}
}
