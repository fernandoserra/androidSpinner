package com.program.user.androidspinner.model;

public class TagModel {
    private int id;
    private String title;
    private String created_at;

    public TagModel(int id, String title, String created_at) {
        this.id = id;
        this.title = title;
        this.created_at = created_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return title;
    }

}
