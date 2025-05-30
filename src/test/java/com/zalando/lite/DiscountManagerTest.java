package com.zalando.lite;

import com.zalando.lite.annotations.VIP;
import org.junit.jupiter.api.*;

import java.util.Arrays;

/**
 * Unit tests for {@link DiscountManager}.
 *
 * These tests verify:
 * - VIP customers receive the correct discount (10%)
 * - Products in the "Shoes" category receive a 20% discount
 * - Discounts do not stack incorrectly
 * - Non-VIP customers with non-discount categories pay full price
 *
 * Concepts reinforced:
 * - Reflection testing with @VIP annotation
 * - Precision checking with floating point assertions
 * - Conditional logic paths
 */
public class DiscountManagerTest {

    private DiscountManager discountManager;

    @BeforeEach
    void setUp() {
        // Prepare a fresh instance before each test
        discountManager = new DiscountManager();
    }

    @Test
    void testVipDiscountApplied() {
        // TODO: Create a customer with @VIP annotation
        // TODO: Create a product in a non-discounted category
        // TODO: Apply discount and assert it's 10% off
    }

    @Test
    void testCategoryDiscountApplied() {
        // TODO: Create a non-VIP customer
        // TODO: Create a product with category "Shoes"
        // TODO: Apply discount and assert it's 20% off
    }

    @Test
    void testNoDiscountApplied() {
        // TODO: Create a non-VIP customer
        // TODO: Create a product in a non-discounted category
        // TODO: Assert final price equals original
    }

    @Test
    void testVipAndCategoryDiscountConflict() {
        // ⚠️ This test ensures you understand your business logic:
        // If both VIP and category apply, which one should take priority?
        // Design decision: Apply only one, or the higher?
        // TODO: Assert consistent behavior
    }

    @AfterEach
    void tearDown() {
        // Reset if needed (usually not necessary for pure logic tests)
    }
}
