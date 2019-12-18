package com.example.mediabase.movies;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
//import com.example.mediabase.moviesui.ActionServlet;
//import com.example.mediabase.moviesui.MovieClient;

@SpringBootApplication
public class MovieMicroserviceApplication {

//    @Value("${movies.ms.url}")
//    private String moviesURL;

    public static void main(String... args) {
        SpringApplication.run(MovieMicroserviceApplication.class, args);
    }
}