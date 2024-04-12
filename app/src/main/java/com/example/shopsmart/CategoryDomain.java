package com.example.shopsmart;

public class CategoryDomain {
    private String title;
    private int id;

    public CategoryDomain(String title, int id, String picUrl) {
        this.title = title;
        this.id = id;
    }

    public CategoryDomain() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }
}