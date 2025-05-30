package com.zalando.lite;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for {@link OrderManager}.
 *
 * These tests verify:
 * - Order creation with valid stock
 * - Orders are stored and retrieved correctly
 * - Orders fail when products are out of stock
 * - Inventory updates correctly after order
 *
 * Concepts reinforced:
 * - Control flow testing
 * - State mutation (inventory reduction)
 * - Object relationships (Order → Customer + Items)
 */
public class OrderManagerTest {

    private InventoryManager inventoryManager;
    private OrderManager orderManager;
    private Customer testCustomer;

    @BeforeEach
    void setUp() {
        // Prepare managers and a test customer
        inventoryManager = new InventoryManager();
        orderManager = new OrderManager(inventoryManager);
        testCustomer = new Customer();
        // TODO: Set basic customer info (e.g., ID)
    }

    @Test
    void testCreateOrderSuccess() {
        // TODO: Add product with enough stock to inventory
        // TODO: Create OrderItem and call createOrder
        // TODO: Assert order is not null
        // TODO: Assert total price and order fields are correct
    }

    @Test
    void testCreateOrderFailsIfOutOfStock() {
        // TODO: Add product with 0 stock
        // TODO: Try to create an order and assert the result is null or handled safely
    }

    @Test
    void testOrdersAreStoredByCustomer() {
        // TODO: Create two orders for the same customer
        // TODO: Retrieve orders using getOrdersForCustomer
        // TODO: Assert the list contains both orders
    }

    @Test
    void testInventoryUpdatedAfterOrder() {
        // TODO: Add product with known stock
        // TODO: Place order that reduces some stock
        // TODO: Check that stock value is correctly reduced
    }

    @AfterEach
    void tearDown() {
        // Reset fields if necessary (optional for logic-based unit tests)
    }
}
