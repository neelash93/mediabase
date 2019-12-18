package com.example.mediabase;

import com.example.mediabase.moviesui.MovieUI;
import com.example.mediabase.moviesui.MovieClient;
import com.example.mediabase.moviesui.MoviesInitialList;
import com.example.mediabase.podcastsui.PodcastUI;
import com.example.mediabase.podcastsui.PodcastClient;
import com.example.mediabase.podcastsui.PodcastsInitialList;

//import com.example.mediabase.podcasts.PodcastRepository;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class RootController {
    private MovieClient movieClient;
    private PodcastClient podcastClient;
    //private PodcastRepository podcastRepository;
    private MoviesInitialList moviesInitialList;
    private PodcastsInitialList podcastsInitialList;

    public RootController(MovieClient movieClient, MoviesInitialList moviesInitialList, PodcastClient podcastClient, PodcastsInitialList podcastsInitialList) {
        this.movieClient = movieClient;
        this.moviesInitialList = moviesInitialList;

        this.podcastClient = podcastClient;
        this.podcastsInitialList = podcastsInitialList;
    }

    @GetMapping("/")
    public String rootPath() {
        return "index";
    }

    @GetMapping("/setup")
    public String setupDatabase(Map<String, Object> model) {

        moviesInitialList.asList().forEach(movieClient::create);

        podcastsInitialList.asList().forEach(podcastClient::create);

        model.put("movies", movieClient.getAll());

        model.put("podcasts", podcastClient.getAll());

        return "setup";
    }

}
