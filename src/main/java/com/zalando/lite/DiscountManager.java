package com.zalando.lite;

import com.zalando.lite.annotations.VIP;
import java.lang.reflect.Field;

/**
 * Applies discount logic for customers and products in the ZalandoLite system.
 *
 * This class uses Java Reflection to check if a customer qualifies for a discount.
 * It also supports category-specific discounts (like for "Shoes").
 *
 * Discounts:
 * - VIP customers: 10% off
 * - Products in "Shoes" category: 20% off
 *
 * Concepts reinforced:
 * - Reflection
 * - Conditional logic
 * - Method extraction & code reuse
 */
public class DiscountManager {

    /**
     * Applies applicable discounts based on customer VIP status and product category.
     *
     * Reflection is used to detect the @VIP annotation on the Customer object.
     *
     * @param customer the customer making the purchase
     * @param product the product being purchased
     * @return the final price after discount
     */
    public double applyDiscount(Customer customer, Product product) { /* ... */ }

    /**
     * Checks if a customer has a @VIP annotation.
     *
     * This method uses reflection to access fields marked as VIP and check their values.
     *
     * @param customer the customer to inspect
     * @return true if VIP, false otherwise
     */
    private boolean isVipUsingReflection(Customer customer) { /* ... */ }

    /**
     * Checks if the product qualifies for a category-based discount.
     *
     * @param product the product to check
     * @return true if the category matches discount rules
     */
    private boolean isCategoryDiscounted(Product product) { /* ... */ }
}
