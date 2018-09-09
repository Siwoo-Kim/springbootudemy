package com.siwoo.springbootudemy.controllers;

import com.siwoo.springbootudemy.model.Author;
import com.siwoo.springbootudemy.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sm123tt@gmail.com on 2018-09-09
 * Project : springbootudemy
 * Github : http://github.com/Siwoo-Kim
 */
@RestController
public class AuthorController {

    AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @CrossOrigin(origins = "http://localhost:9000")
    @GetMapping("/authors")
    public List<Author> getAuthors() {
        List<Author> authors = new ArrayList<>();
        for(Author author: authorRepository.findAll()) {
            authors.add(author);
        }
        return authors;
    }
}
