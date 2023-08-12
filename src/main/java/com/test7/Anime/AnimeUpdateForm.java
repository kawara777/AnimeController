package com.test7.Anime;

public class AnimeUpdateForm {

    private String name;

    public AnimeUpdateForm(String name, int episodes) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
