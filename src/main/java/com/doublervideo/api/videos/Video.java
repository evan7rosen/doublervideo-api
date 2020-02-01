package com.doublervideo.api.videos;

import lombok.Data;

import javax.persistence.*;


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

    public Video() {}
}
