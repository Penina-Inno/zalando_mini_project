package com.zalando.lite;

import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for {@link ReviewManager}.
 *
 * These tests verify:
 * - Reviews are properly added and linked to the correct product
 * - Multiple reviews can be added per product
 * - Retrieving reviews by product ID returns expected results
 * - System handles missing reviews safely (returns empty list, not null)
 *
 * Concepts reinforced:
 * - Nested collection testing: Map<Integer, List<Review>>
 * - Defensive testing (null handling)
 * - Composition: testing Product + Customer + Review
 */
public class ReviewManagerTest {

    private ReviewManager reviewManager;
    private Product sampleProduct;
    private Customer sampleCustomer;

    @BeforeEach
    void setUp() {
        // Initialize test manager and sample objects
        reviewManager = new ReviewManager();
        sampleProduct = new Product();
        sampleCustomer = new Customer();
        // TODO: Set minimal required fields like product ID, customer ID
    }

    @Test
    void testAddReviewAndRetrieve() {
        // TODO: Create a Review and add it
        // TODO: Retrieve reviews for product and assert it contains the review
    }

    @Test
    void testMultipleReviewsForSameProduct() {
        // TODO: Add 2–3 reviews for same product
        // TODO: Retrieve list and assert size == 3
    }

    @Test
    void testRetrieveReviewsForNonReviewedProductReturnsEmptyList() {
        // TODO: Use a product ID with no reviews
        // TODO: Assert that result is not null and isEmpty() is true
    }

    @AfterEach
    void tearDown() {
        // Optional: cleanup if static/shared state is used later
    }
}
