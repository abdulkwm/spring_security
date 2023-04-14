package com.example.movies.controller;

import com.example.movies.entity.Movie;
import com.example.movies.service.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/api")
public class MovieController {
    @Autowired
    MovieServiceImpl movieServiceImpl;

    //get all movies
    @GetMapping("/movies")
    public List<Movie> getAll(){
        List<Movie> movies = movieServiceImpl.getAllMovies();
        System.out.println("all movies " + movies.size());
        return movies;
    }
    //get a movie by id
    @GetMapping("/movies/{id}")
    public Movie getMovieById(@PathVariable Long id){
        Movie movie = movieServiceImpl.getMovieById(id);
        return movieServiceImpl.getMovieById(id);
    }
    //get movie by name
    @GetMapping("/movies/{name}")
    public Movie getMovieByName(@PathVariable String name){
        Movie movie = movieServiceImpl.getMovieByName(name);
        return movieServiceImpl.getMovieByName(name);
    }
    //insert a movie or save movie
    @PostMapping("/movies")
    public Movie saveMovie(@RequestBody Movie movie){
        return movieServiceImpl.saveMovie(movie);
    }
    //updating movies
    @PutMapping("movies/{id}")
    public Movie updateMovies(@PathVariable Long id, @RequestBody Movie movie){
        movie.setMovieId(id);
        return movieServiceImpl.update(movie);
    }
    //delete a movie
    @DeleteMapping("/movies/{id}")
    public String delete(@PathVariable Long id){
        movieServiceImpl.deleteMovie(id);
        return "movie id " + id + " deleted successfully";
    }
}
