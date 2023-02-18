package dev.fishiii.movies.service;

import dev.fishiii.movies.entity.Review;

public interface ReviewServices {
    Review createReview(String reviewBody, String imdbId);
}
