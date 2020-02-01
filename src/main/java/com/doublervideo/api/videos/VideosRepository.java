package com.doublervideo.api.videos;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VideosRepository extends JpaRepository<Video, Integer> {
}
