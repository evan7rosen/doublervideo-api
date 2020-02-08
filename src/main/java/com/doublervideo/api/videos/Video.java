package com.doublervideo.api.videos;

import com.doublervideo.api.users.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "videos")
@Data

public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String title;

    @Column
    private String url;

    @Column
    private String date;

    @ManyToMany(mappedBy = "videos")
    @JsonIgnoreProperties("videos")
    private List<User> users;


    public Video() {}
}
