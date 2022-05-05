package com.startjava.lesson_2_3_4.bookshelf;

public class Book {
    private String author;
    private String title;
    private int publishYear;

    public Book(String author, String title, int publishYear) {
        this.author = author;
        this.title = title;
        this.publishYear = publishYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public String getFullName() {
        return "<" + getAuthor() + ", " + getTitle() + ", " + getPublishYear() + ">";
    }
}
