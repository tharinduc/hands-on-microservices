package com.tharindu.libraryservice.models;

import java.util.List;

public class BooksInfo {
    private List<Book> books;

    public BooksInfo(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
