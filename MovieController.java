package com.wipro.movies_spring;


import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final Map<String, Movie> movies = new HashMap<>();

    @PostConstruct
    public void init() {
        movies.put("M101", new Movie("M101", "Inception", "Leonardo DiCaprio", "Elliot Page", "Christopher Nolan", 950.0));
        movies.put("M102", new Movie("M102", "Titanic", "Leonardo DiCaprio", "Kate Winslet", "James Cameron", 2200.0));
    }

    @GetMapping
    public Collection<Movie> getAllMovies() {
        return movies.values();
    }

    @GetMapping("/{movieID}")
    public ResponseEntity<?> getMovieById(@PathVariable String movieID) {
        Movie movie = movies.get(movieID);

        if (movie != null) {
            return new ResponseEntity<>(movie, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Movie not found", HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<String> addMovie(@RequestBody Movie movie) {
        if (movies.containsKey(movie.getMovieID())) {
            return new ResponseEntity<>("Movie ID already exists", HttpStatus.CONFLICT);
        }

        movies.put(movie.getMovieID(), movie);
        return new ResponseEntity<>("Movie added successfully", HttpStatus.CREATED);
    }

    @PutMapping("/{movieID}")
    public ResponseEntity<String> updateMovie(@PathVariable String movieID, @RequestBody Movie movie) {
        if (movies.containsKey(movieID)) {
            movie.setMovieID(movieID);
            movies.put(movieID, movie);
            return new ResponseEntity<>("Movie updated successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Movie not found", HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{movieID}")
    public ResponseEntity<String> deleteMovie(@PathVariable String movieID) {
        return new ResponseEntity<>("DELETE method is not supported", HttpStatus.METHOD_NOT_ALLOWED);
    }
}