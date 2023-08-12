package com.test7.Anime;

import jakarta.validation.constraints.NotBlank;

public class Anime {

    private int id;
    private String name;
    private int episodes;

    public Anime(int id, String name, int episodes) {
        this.id = id;
        this.name = name;
        this.episodes = episodes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

}

