package com.example.movies.repository;

import com.example.movies.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie,Long> {
    @Override
    Optional<Movie> findById(Long id);

    Movie findByName(String name);
}
