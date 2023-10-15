package com.yourpackage.controller;

import com.yourpackage.model.MovieReview;
import com.yourpackage.repository.MovieReviewRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class MovieReviewController {

    private final MovieReviewRepository repository;

    public MovieReviewController(MovieReviewRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<MovieReview> getAllReviews() {
        return repository.findAll();
    }

    @PostMapping
    public MovieReview addReview(@RequestBody MovieReview review) {
        return repository.save(review);
    }
}

