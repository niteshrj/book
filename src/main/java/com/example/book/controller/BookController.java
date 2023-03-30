package com.example.book.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("")
public class BookController {

    @GetMapping(value = "/books")
    public ResponseEntity<List<Book>> getUser() {
        List<Book> books = Arrays.asList(
                new Book("1", "Who moved my cheese", 500),
                new Book("2", "One Minute Manager", 150),
                new Book("3", "Harry Potter", 700)
        );
        return ResponseEntity.ok(books);
    }
}
