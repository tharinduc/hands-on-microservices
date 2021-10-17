package com.tharindu.bookinfoservice.models;

public class Book {
    private int bookId;
    private String name;
    private String desc;
    private String author;

    public Book(int bookId, String name, String desc, String author) {
        this.bookId = bookId;
        this.name = name;
        this.desc = desc;
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
