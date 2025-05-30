package com.zalando.lite;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Represents a customer's order in the ZalandoLite system.
 *
 * Each order includes:
 * - A unique order ID
 * - A reference to the customer who placed the order
 * - A list of line items (products and their quantities)
 * - A timestamp of when the order was placed
 *
 * This class is central to the business logic and ties together customers,
 * products, and delivery.
 *
 * Concepts reinforced:
 * - Object composition
 * - Use of lists to store related data
 * - Timestamps using LocalDateTime
 */
public class Order {

    // Unique identifier for the order
    private int orderId;

    // The customer who placed the order (reference, not a copy)
    private Customer customer;

    // A list of items included in the order
    private List<OrderItem> items;

    // The date and time the order was created
    private LocalDateTime orderDate;

    /**
     * Constructor to initialize an order with a customer and list of items.
     *
     * Automatically sets the order date to the current timestamp.
     */

    // Returns the order ID
    public int getOrderId() { /* ... */ }

    // Sets the order ID (may be used when generating orders manually)
    public void setOrderId(int orderId) { /* ... */ }

    // Returns the customer who placed the order
    public Customer getCustomer() { /* ... */ }

    // Sets the customer for the order
    public void setCustomer(Customer customer) { /* ... */ }

    // Returns the list of order items
    public List<OrderItem> getItems() { /* ... */ }

    // Sets the list of order items
    public void setItems(List<OrderItem> items) { /* ... */ }

    // Returns the timestamp of when the order was placed
    public LocalDateTime getOrderDate() { /* ... */ }

    // Sets the order timestamp (usually auto-generated)
    public void setOrderDate(LocalDateTime orderDate) { /* ... */ }

    /**
     * Calculates the total cost of the order by summing
     * (product price × quantity) for each line item.
     *
     * @return the total order cost
     */
    public double calculateTotal() { /* ... */ }

    /**
     * Returns a string summary of the order.
     * Useful for displaying in CLI or logs.
     */
    @Override
    public String toString() { /* ... */ }
}
