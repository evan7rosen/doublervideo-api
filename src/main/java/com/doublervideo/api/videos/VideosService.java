package com.doublervideo.api.videos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VideosService {
    @Autowired
    private final VideosRepository videosRepository;

    public VideosService(VideosRepository videosRepository) {
        this.videosRepository = videosRepository;
    }

    public List<Video> getAllVideos() {
        return this.videosRepository.findAll();
    }

    public Optional<Video> getOneVideo(int id) {
        return videosRepository.findById(id);
    }

    public Video addOneVideo(Video newVideo) {
        return videosRepository.save(newVideo);
    }

    public Video updateOneVideo(Video updatedVideo) {
        return videosRepository.save(updatedVideo);
    }

    public String removeOneVideo(int id) {
        videosRepository.deleteById(id);
        return "Id " + id + " was removed";
    }
}