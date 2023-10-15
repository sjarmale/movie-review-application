package com.yourpackage.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
public class MovieReview {

    @Id
    private String id;
    private String movieName;
    private String review;
    // getters, setters, constructors
}
