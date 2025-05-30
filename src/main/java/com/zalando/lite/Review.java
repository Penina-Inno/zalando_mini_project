package com.zalando.lite;

import java.time.LocalDateTime;

/**
 * Represents a customer review of a product in the ZalandoLite system.
 *
 * Each review includes:
 * - The customer who wrote it
 * - The product being reviewed
 * - A star rating (e.g., 1 to 5)
 * - Optional comment text
 * - A timestamp for when the review was created
 *
 * This class models simple feedback logic and is often stored in a map structure
 * like Map<ProductId, List<Review>>.
 *
 * Concepts reinforced:
 * - Simple data modeling
 * - Composition (Customer and Product)
 * - Timestamps
 */
public class Review {

    // The customer who left the review
    private Customer customer;

    // The product being reviewed
    private Product product;

    // Rating from 1 to 5 stars
    private int rating;

    // Optional comment (can be empty or null)
    private String comment;

    // Timestamp for when the review was written
    private LocalDateTime timestamp;

    /**
     * Constructor for creating a review.
     * This should validate rating (1–5) and auto-set timestamp.
     */

    // Returns the customer who submitted the review
    public Customer getCustomer() { /* ... */ }

    // Sets the customer reference
    public void setCustomer(Customer customer) { /* ... */ }

    // Returns the reviewed product
    public Product getProduct() { /* ... */ }

    // Sets the product that was reviewed
    public void setProduct(Product product) { /* ... */ }

    // Returns the numeric star rating
    public int getRating() { /* ... */ }

    // Sets the star rating — consider validating range (1–5)
    public void setRating(int rating) { /* ... */ }

    // Returns the optional text comment
    public String getComment() { /* ... */ }

    // Sets the text comment for the review
    public void setComment(String comment) { /* ... */ }

    // Returns the creation timestamp
    public LocalDateTime getTimestamp() { /* ... */ }

    // Sets the timestamp (usually only called in constructor)
    public void setTimestamp(LocalDateTime timestamp) { /* ... */ }

    /**
     * Returns a formatted string representation of the review.
     * Useful for logs, CLI display, or reports.
     */
    @Override
    public String toString() { /* ... */ }
}
