package com.example.movies.repository;

import com.example.movies.entity.Favorite;
import com.example.movies.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FavoriteRepository extends JpaRepository<Favorite,Long> {
    List<Favorite> findByUser(User user);
}
