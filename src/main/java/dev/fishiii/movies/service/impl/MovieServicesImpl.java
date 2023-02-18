package dev.fishiii.movies.service.impl;

import dev.fishiii.movies.entity.Movie;
import dev.fishiii.movies.repository.MovieRepository;
import dev.fishiii.movies.service.MovieServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServicesImpl implements MovieServices {

    private final MovieRepository movieRepository;

    public MovieServicesImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> findAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Optional<Movie> findMovieByImdbId(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
