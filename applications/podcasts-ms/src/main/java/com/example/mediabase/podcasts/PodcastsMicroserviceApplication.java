package com.example.mediabase.podcasts;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;


@EnableEurekaClient
@SpringBootApplication
public class PodcastsMicroserviceApplication {

    public static void main(String... args) {
        SpringApplication.run(PodcastsMicroserviceApplication.class, args);
    }
}