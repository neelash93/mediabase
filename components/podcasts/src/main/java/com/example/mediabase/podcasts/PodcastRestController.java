package com.example.mediabase.podcasts;

import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.List;

@RestController
@RequestMapping("/podcasts")
public class PodcastRestController {

    private PodcastRepository podcastRepository;

    public PodcastRestController(PodcastRepository podcastRepository)
    {
        this.podcastRepository = podcastRepository;
    }

    @PostMapping
    public ResponseEntity<Podcast> create(@RequestBody Podcast podcast) {
        podcastRepository.save(podcast);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping()
    public List<Podcast> allPodcasts() {
        return (List<Podcast>)podcastRepository.findAll();
    }


}
