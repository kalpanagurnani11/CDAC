package com.example.controller;

import com.example.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
public class BookController {
    private final List<Book> books = new ArrayList<>();

    public BookController() {
        books.add(new Book(UUID.randomUUID().toString(), "Spring in Action", "Craig Walls", "9781617294945"));
        books.add(new Book(UUID.randomUUID().toString(), "Clean Code", "Robert C. Martin", "9780132350884"));
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("books", books);
        model.addAttribute("newBook", new Book());
        return "index";
    }

    @PostMapping("/addBook")
    public String addBook(@ModelAttribute Book book) {
        book.setId(UUID.randomUUID().toString());
        books.add(book);
        return "redirect:/";
    }
}
