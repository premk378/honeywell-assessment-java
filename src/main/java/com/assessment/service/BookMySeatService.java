package com.assessment.service;

import com.assessment.dto.Movie;
import com.assessment.dto.Theatre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BookMySeatService {

    public List<Movie> getAllMovies() {
        List<Movie> lstMovies = new ArrayList<>();
        lstMovies.add(new Movie("1917",1L, "2h 25min","Sample description", 120L, "1917.jpg"));
        lstMovies.add(new Movie("1917",1L, "2h 25min","Sample description", 120L, "1917.jpg"));
        lstMovies.add(new Movie("1917",1L, "2h 25min","Sample description", 120L, "1917.jpg"));
        lstMovies.add(new Movie("1917",1L, "2h 25min","Sample description", 120L, "1917.jpg"));
        lstMovies.add(new Movie("1917",1L, "2h 25min","Sample description", 120L, "1917.jpg"));
        lstMovies.add(new Movie("1917",1L, "2h 25min","Sample description", 120L, "1917.jpg"));
        lstMovies.add(new Movie("1917",1L, "2h 25min","Sample description", 120L, "1917.jpg"));
        lstMovies.add(new Movie("1917",1L, "2h 25min","Sample description", 120L, "1917.jpg"));
        return lstMovies;
    }

    public List<Movie> getAllMoviesByFilter(String name) {
        return this.getAllMovies().stream().filter(movie -> movie.getMovieName().toLowerCase().contains(name.toLowerCase())).collect(Collectors.toList());
    }

    public List<Theatre> getAllTheatres(Long movieId) {
        List<Theatre> lstTheatres = new ArrayList<>();
        lstTheatres.add(new Theatre("AMB Cinemas", 1L, "Gachibowli", "Sample description", Arrays.asList("11:00AM","5:30PM")));
        lstTheatres.add(new Theatre("AMB Cinemas", 2L, "Gachibowli", "Sample description", Arrays.asList("11:00AM","5:30PM")));
        lstTheatres.add(new Theatre("AMB Cinemas", 3L, "Gachibowli", "Sample description", Arrays.asList("11:00AM","5:30PM")));
        lstTheatres.add(new Theatre("AMB Cinemas", 4L, "Gachibowli", "Sample description", Arrays.asList("11:00AM","5:30PM")));
        lstTheatres.add(new Theatre("AMB Cinemas", 5L, "Gachibowli", "Sample description", Arrays.asList("11:00AM","5:30PM")));
        lstTheatres.add(new Theatre("AMB Cinemas", 6L, "Gachibowli", "Sample description", Arrays.asList("11:00AM","5:30PM")));
        return lstTheatres;
    }
}
