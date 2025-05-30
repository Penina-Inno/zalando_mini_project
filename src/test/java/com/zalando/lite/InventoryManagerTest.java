package com.zalando.lite;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for {@link InventoryManager}.
 *
 * These tests validate:
 * - Adding products to inventory
 * - Finding products by ID
 * - Listing all available products
 * - Reducing stock safely and accurately
 * - Checking product availability
 *
 * Concepts reinforced:
 * - Collection management
 * - State mutation and validation
 * - Defensive programming (e.g., stock can't go negative)
 */
public class InventoryManagerTest {

    private InventoryManager inventoryManager;

    @BeforeEach
    void setUp() {
        // Create a fresh InventoryManager before each test
        inventoryManager = new InventoryManager();
    }

    @Test
    void testAddAndFindProductById() {
        // TODO: Create a sample product with ID = 1
        // TODO: Add it to the inventory
        // TODO: Use findProductById and assert the result is not null
    }

    @Test
    void testListAllProductsReturnsCorrectSize() {
        // TODO: Add multiple products
        // TODO: Assert that listAllProducts returns the correct count
    }

    @Test
    void testReduceStockSuccessfully() {
        // TODO: Add a product with quantity 10
        // TODO: Reduce stock by 3
        // TODO: Assert new stock is 7
    }

    @Test
    void testReduceStockFailsOnInsufficientQuantity() {
        // TODO: Add a product with stock = 2
        // TODO: Try reducing by 5
        // TODO: Assert reduceStock returns false
    }

    @Test
    void testIsProductAvailableReturnsTrueIfInStock() {
        // TODO: Add a product with stock > 0
        // TODO: Assert isProductAvailable returns true
    }

    @Test
    void testIsProductAvailableReturnsFalseIfOutOfStock() {
        // TODO: Add a product with stock = 0
        // TODO: Assert isProductAvailable returns false
    }

    @AfterEach
    void tearDown() {
        // Clean up if necessary (not strictly needed for this manager)
    }
}
