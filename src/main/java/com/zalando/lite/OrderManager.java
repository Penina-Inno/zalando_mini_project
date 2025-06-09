package com.zalando.lite;

import java.util.List;
import java.util.Map;


/**
 * Handles the creation, validation, and storage of orders in the ZalandoLite system.
 *
 * This manager:
 * - Accepts a list of items and a customer to create a new {@link Order}
 * - Checks inventory levels before processing the order
 * - Updates stock accordingly
 * - Stores and retrieves orders per customer
 *
 * Serves as the glue between the inventory and customer layers.
 *
 * Concepts reinforced:
 * - Aggregation and system coordination
 * - Control flow with validation
 * - Data structure usage (Map for customer orders)
 */
public class OrderManager {

    // Stores orders for each customer (keyed by customer ID)
    private Map<Integer, List<Order>> customerOrders;

    // Used to update inventory after order placement
    private InventoryManager inventoryManager;


    /**
     * Creates a new order for the given customer and list of order items.
     *
     * Validates product availability before allowing the order to proceed.
     *
     * @param customer the customer placing the order
     * @param items a list of OrderItem entries to be purchased
     * @return the created Order, or null if validation fails
     */
    public Order createOrder(Customer customer, List<OrderItem> items) {
        if (!validateStock(items)) {
            System.out.println("Order failed: One or more items are out of stock.");
            return null;
        }

        updateInventory(items);

        Order order = new Order(nextOrderId++, customerId, LocalDateTime.now(), items);
        customerOrders.computeIfAbsent(customerId, k -> new ArrayList<>()).add(order);
        return order;
    }
    /**
     * Retrieves all orders placed by a specific customer.
     *
     * @param customerId the ID of the customer
     * @return a list of their orders, or an empty list if none exist
     */
    public List<Order> getOrdersForCustomer(int customerId) {
        return customerOrders.getOrDefault(customerId, new ArrayList<>());
    }
}

    /**
     * Optional helper: Validates item quantities before processing.
     *
     * @param items the list of items to validate
     * @return true if all items are in stock
     */
    private boolean validateStock(List<OrderItem> items) {
        for (OrderItem item : items) {
            int productId = item.getProduct().getId();
            int quantity = item.getQuantity();

            if (!inventoryManager.isInStock(productId, quantity)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Optional helper: Updates inventory after successful order.
     *
     * @param items the list of items whose stock should be reduced
     */
    private void updateInventory(List<OrderItem> items) {
        for (OrderItem item : items) {
            inventoryManager.reduceStock(item.getProduct().getId(), item.getQuantity());
        }
}
    public List<Order> getOrdersForCustomer(int customerId) {
    return customerOrders.getOrDefault(customerId, new ArrayList<>());
      }
}
public void main() {
}
