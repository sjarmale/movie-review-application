package com.yourpackage.repository;

import com.yourpackage.model.MovieReview;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieReviewRepository extends MongoRepository<MovieReview, String> {
}
