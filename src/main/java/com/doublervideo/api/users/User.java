package com.doublervideo.api.users;

import com.doublervideo.api.videos.Video;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.List;


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

    @ManyToMany
    @JoinTable(
            name = "users_videos",
            joinColumns = @JoinColumn(name ="user_id"),
            inverseJoinColumns = @JoinColumn(name = "video_id"))
    @JsonIgnoreProperties("users")
    private List<Video> videos;

    public User() {}
}
