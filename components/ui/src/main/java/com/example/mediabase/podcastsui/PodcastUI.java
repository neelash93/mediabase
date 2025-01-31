package com.example.mediabase.podcastsui;

import java.io.Serializable;

public class PodcastUI implements Serializable {

    private static final long serialVersionUID = 1L;

    private String title;
    private String description;
    private String url;

    private Long id;

    public PodcastUI() {
    }

    public PodcastUI(String title, String description, String url) {
        this.title = title;
        this.description = description;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
