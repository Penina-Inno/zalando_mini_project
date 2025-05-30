package com.zalando.lite;

import org.junit.jupiter.api.*;

/**
 * Unit tests for the {@link CustomerManager} class.
 *
 * These tests verify:
 * - Registering a new customer
 * - Retrieving a customer by ID
 * - Null handling when customer is not found
 *
 * Demonstrates how to use JUnit 5 annotations:
 * - @BeforeAll for one-time setup
 * - @BeforeEach for per-test setup
 * - @AfterEach and @AfterAll for cleanup logic (if needed)
 *
 * Concepts reinforced:
 * - JUnit lifecycle
 * - Assertions for equality and null checks
 * - Testing collections and object references
 */
public class CustomerManagerTest {

    private CustomerManager customerManager;

    @BeforeAll
    static void initAll() {
        // Runs once before all tests
        // Can be used for heavy setup, e.g., static mock data
    }

    @BeforeEach
    void init() {
        // Runs before each test
        // Fresh instance of manager ensures test isolation
        customerManager = new CustomerManager();
    }

    @Test
    void testRegisterAndRetrieveCustomer() {
        // TODO: Create a new Customer
        // TODO: Register it
        // TODO: Retrieve it by ID and assert it's the same
    }

    @Test
    void testRetrieveNonExistentCustomerReturnsNull() {
        // TODO: Try getting a customer with an unused ID
        // TODO: Assert that the result is null
    }

    @AfterEach
    void tearDown() {
        // Runs after each test
        // Could be used to clear static data if shared
    }

    @AfterAll
    static void tearDownAll() {
        // Runs once after all tests
        // Used for global cleanup (e.g., closing DB connections)
    }
}
