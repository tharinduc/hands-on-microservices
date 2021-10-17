package com.tharindu.bookinfoservice.resources;

import com.tharindu.bookinfoservice.models.Book;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookInfo")
public class BookInfoResource {

    @RequestMapping("/{bookId}")
    public Book getBookInfo(@PathVariable("bookId") int bookId) {
        return new Book(bookId, "Death on the Nile", "Murder of a young woman", "Agatha Christie");
    }
}
