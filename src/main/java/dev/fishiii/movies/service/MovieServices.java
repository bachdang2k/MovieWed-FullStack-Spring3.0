package dev.fishiii.movies.service;

import dev.fishiii.movies.entity.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieServices {
    List<Movie> findAllMovies();
    Optional<Movie> findMovieByImdbId(String imdbId);
}
