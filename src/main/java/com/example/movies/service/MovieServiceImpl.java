package com.example.movies.service;

import com.example.movies.entity.Movie;
import com.example.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{
    private final MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
    //save movie
    @Override
    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }
    //update/create movie
    // TODO: 4/14/23  
    @Override
    public Movie update(Movie movie){
        return movieRepository.save(movie);
    }
    //delete movie
    @Override
    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }
    //get all movies
    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
    //get movie by name
    @Override
    public Movie getMovieByName(String name) {
        return movieRepository.findByName(name);
    }
    //get movie by id
    @Override
    public Movie getMovieById(Long id) {
        return movieRepository.findById(id).get();
    }
}
