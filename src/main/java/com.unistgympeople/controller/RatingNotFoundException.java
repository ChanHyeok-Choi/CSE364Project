package com.unistgympeople.movies.controller;

class RatingNotFoundException extends RuntimeException {

    RatingNotFoundException(String movieId) {
        super("Could not find Rating " + movieId);
    }
}