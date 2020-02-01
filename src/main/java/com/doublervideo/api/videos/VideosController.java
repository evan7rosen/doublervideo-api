package com.doublervideo.api.videos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/videos")

public class VideosController {

    @Autowired
    private final VideosService videosService;

    public VideosController(VideosService videosService) {
        this.videosService = videosService;
    }

    @GetMapping
    public List<Video> getAllVideos() {
        return this.videosService.getAllVideos();
    }

    @GetMapping("/{id}")
    public Video getOneVideo(@PathVariable int id) {
        Video video = videosService.getOneVideo(id).orElseThrow(IllegalArgumentException::new);
        return video;
    }

    @PostMapping
    public Video addOneVideo(@RequestBody Video newVideo) {
        if (newVideo.getTitle() == null || newVideo.getUrl() == null) {
            throw new IllegalArgumentException("Not all fields are valid.");
        }
        return videosService.addoneVideo(newVideo);
    }

    @PatchMapping
    public Video updateOneVideo(@RequestBody Video updatedVideo) {
        Video video = videosService.getOneVideo(updatedVideo.getId()).orElseThrow(IllegalArgumentException::new);
        return videosService.updateOneVideo(updatedVideo);
    }

    @DeleteMapping("/{id}")
    public String removeOneVideo(@PathVariable int id) {
        Video video = videosService.getOneVideo(id).orElseThrow(IllegalArgumentException::new);
        return videosService.removeOneVideo(id);
    }
}
