package com.assessment.controller;

import com.assessment.dto.Movie;
import com.assessment.dto.Theatre;
import com.assessment.service.BookMySeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookMySeatController {

    @Autowired
    private BookMySeatService bookMySeatService;

    @GetMapping(value = "/movies")
    public List<Movie> getEmployees() {
        List<Movie> movies = bookMySeatService.getAllMovies();
        return movies;
    }

    @GetMapping(value = "/movies/{name}")
    public List<Movie> getMovieByFilter(@PathVariable String name) {
        List<Movie> movies = bookMySeatService.getAllMoviesByFilter(name);
        return movies;
    }

    @GetMapping(value = "/theatres/{movieId}")
    public List<Theatre> getTheatres(@PathVariable Long movieId) {
        List<Theatre> theatres = bookMySeatService.getAllTheatres(movieId);
        return theatres;
    }
}
