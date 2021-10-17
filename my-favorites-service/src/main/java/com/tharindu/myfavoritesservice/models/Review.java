package com.tharindu.myfavoritesservice.models;

public class Review {
    private int bookId;
    private String comment;

    public Review(int bookId, String comment) {
        this.bookId = bookId;
        this.comment = comment;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
