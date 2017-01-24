package com.example.routengo1.model;

/**
 * Created by megaman on 18.01.2017.
 */

public class Unit {
    private String title;
    private String description;

    public Unit(String title, String description) {
        this.title = title;
        this.description = description;
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
}
