package com.example.demo;

public class Library {
    private int id;
    private String author;
    private String title;
    private int year;

    public Library(int id,  String author, String title, int year) {
        this.id = id;

        this.author = author;
        this.title = title;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }





    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String update(int id, Library library) {
        return library.update(id, library);
    }
}
