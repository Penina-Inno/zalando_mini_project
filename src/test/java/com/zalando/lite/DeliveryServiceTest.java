package com.zalando.lite;

import org.junit.jupiter.api.*;

/**
 * Unit tests for the {@link DeliveryService} class.
 *
 * These tests verify:
 * - Courier assignment works when couriers are available
 * - No courier is assigned if all are busy
 * - Delivery status can be updated correctly
 *
 * Also demonstrates the use of JUnit 5 annotations:
 * - @BeforeEach: setup before every test
 * - @AfterEach: clean up after each test
 *
 * Concepts reinforced:
 * - Testing with mock data
 * - Assertions on object behavior
 * - Booleans and state change testing
 */
public class DeliveryServiceTest {

    private DeliveryService deliveryService;
    private Courier availableCourier;
    private Courier busyCourier;
    private Order dummyOrder;

    @BeforeEach
    void setUp() {
        // TODO: Instantiate DeliveryService
        // TODO: Create mock couriers (1 available, 1 unavailable)
        // TODO: Create a mock Order object
    }

    @Test
    void testAssignCourierWhenAvailable() {
        // TODO: Assign courier using deliveryService
        // TODO: Assert that a courier is assigned
        // TODO: Assert that assigned courier is available before assignment
    }

    @Test
    void testAssignCourierWhenNoneAvailable() {
        // TODO: Make all couriers unavailable
        // TODO: Try assigning a courier
        // TODO: Assert that result is null (or handle fallback if designed)
    }

    @Test
    void testUpdateDeliveryStatus() {
        // TODO: Assign a courier to get a Delivery
        // TODO: Update status (e.g., to "Delivered")
        // TODO: Assert that the new status is reflected in the Delivery
    }

    @AfterEach
    void tearDown() {
        // TODO: Reset couriers or clear data structures if necessary
    }
}
