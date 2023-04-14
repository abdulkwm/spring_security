package com.example.movies;

import com.example.movies.entity.User;
import com.example.movies.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MovieLibrarySpringbootH2Application implements CommandLineRunner {
	private final UserRepository userRepository;

	public MovieLibrarySpringbootH2Application(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		List<User> users = new ArrayList<>();
		users.add(new User(101L, "Abdu", "password", "abdu@gmail.com"));
		users.add(new User(102L, "Zakir", "test", "zakir@gmail.com"));
		userRepository.saveAll(users);
	}
	public static void main(String[] args) {
		SpringApplication.run(MovieLibrarySpringbootH2Application.class, args);
	}

}
