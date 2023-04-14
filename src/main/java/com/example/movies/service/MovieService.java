package com.example.movies.service;

import com.example.movies.entity.Movie;

import java.util.List;

public interface MovieService {
    Movie saveMovie(Movie movie);

    Movie update(Movie movie);

    void deleteMovie(Long id);
    List<Movie> getAllMovies();
    Movie getMovieByName(String name);
    Movie getMovieById(Long id);
}
