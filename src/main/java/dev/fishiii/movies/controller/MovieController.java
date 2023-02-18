package dev.fishiii.movies.controller;

import dev.fishiii.movies.entity.Movie;
import dev.fishiii.movies.service.MovieServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieServices movieServices;

    @GetMapping()
    public ResponseEntity<List<Movie>> getMovie() {
        return new ResponseEntity<List<Movie>>(movieServices.findAllMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbID}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbID) {
        return new ResponseEntity<Optional<Movie>>(movieServices.findMovieByImdbId(imdbID), HttpStatus.OK);
    }

}
