package com.test7.Anime;

public class AnimeCreateForm {

    private String name;

    public AnimeCreateForm(String name, int episodes) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
