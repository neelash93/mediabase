package com.example.mediabase.podcasts;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
//import com.example.mediabase.podcastsui.PodcastUIController;
//import com.example.mediabase.podcastsui.PodcastClient;

@SpringBootApplication
public class PodcastsMicroserviceApplication {

//    @Value("${podcasts.ms.url}")
//    private String podcastsURL;

    public static void main(String... args) {
        SpringApplication.run(PodcastsMicroserviceApplication.class, args);
    }
}