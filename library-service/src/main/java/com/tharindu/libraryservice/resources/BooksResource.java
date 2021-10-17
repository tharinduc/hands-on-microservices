package com.tharindu.libraryservice.resources;

import com.tharindu.libraryservice.models.Book;
import com.tharindu.libraryservice.models.BooksInfo;
import com.tharindu.libraryservice.models.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Objects;

@RestController
@RequestMapping("/books")
public class BooksResource {

    @Autowired
    private RestTemplate restTemplate;

    /*@RequestMapping("/")
    public BooksInfo getBooks() {

        return new BooksInfo(
                Arrays.asList(
                        new Book(1,"Death on the Nile", "Murder of a young woman", "Agatha Christie", true),
                        new Book(2,"The Sign of the Four", "The second novel featuring Sherlock Holmes", "Arthur Conan Doyle", false)
                )
        );
    }*/

    @RequestMapping("/{bookId}")
    public BooksInfo getBook(@PathVariable("bookId") int bookId) {

        Book book = restTemplate.getForObject("http://localhost:8081/bookInfo/" + bookId, Book.class);
        if (Objects.isNull(book)) {
            book.setAvailable(false);
        }
        else {
            book.setAvailable(true);
        }

        Review review = restTemplate.getForObject("http://localhost:8083/reviews/" + bookId, Review.class);
        if (Objects.isNull(review)) {
            book.setFavorite(false);
            book.setReview(null);
        }
        else {
            book.setFavorite(true);
            book.setReview(review.getComment());
        }

        return new BooksInfo(
                Arrays.asList(book)
        );
    }
}
