package com.tharindu.myfavoritesservice.resources;

import com.tharindu.myfavoritesservice.models.Review;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reviews")
public class BookReviewResource {

    @RequestMapping("/{bookId}")
    public Review getReview(@PathVariable("bookId") int bookId) {
        return new Review(bookId, "I really like this book");
    }
}
