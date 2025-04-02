package com.rajat.oops.basics;

import java.util.ArrayList;

public class Book {

    private int id;
    private String name;
    private ArrayList<Review> reviews = new ArrayList<Review>();

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addReview(Review review) {
        this.reviews.add(review);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", reviews=" + reviews +
                '}';
    }
}
