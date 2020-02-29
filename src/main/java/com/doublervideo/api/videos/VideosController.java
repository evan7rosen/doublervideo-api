package com.doublervideo.api.videos;

import com.doublervideo.api.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;


@RestController
@RequestMapping("/videos")
@CrossOrigin

public class VideosController {

    @Autowired
    private final VideosService videosService;
    private final EntityManager em;

    public VideosController(VideosService videosService, EntityManager em) {
        this.videosService = videosService;
        this.em = em;
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
//        if (newVideo.getTitle() == null || newVideo.getUrl() == null) {
//            throw new IllegalArgumentException("Not all fields are valid.");
//        }
        return videosService.addOneVideo(newVideo);
    }

    @PatchMapping("/{id}")
    public Video updateOneVideo(@RequestBody Video updatedVideo) {
        Video video = videosService.getOneVideo(updatedVideo.getId()).orElseThrow(IllegalArgumentException::new);
        return videosService.updateOneVideo(updatedVideo);
    }

    @DeleteMapping("/{id}")
    @Transactional
    @CrossOrigin
    public String removeOneVideo(@PathVariable int id) {
        Video video = videosService.getOneVideo(id).orElseThrow(IllegalArgumentException::new);

        Query q1 = this.em.createNativeQuery("delete from users_videos where video_id = ?");
        q1.setParameter(1, id);
        this.em.joinTransaction();
        q1.executeUpdate();

        return videosService.removeOneVideo(id);
    }
}