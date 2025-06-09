package com.zalando.lite;

import java.util.List;

/**
 * Handles the assignment of couriers to orders and manages delivery statuses.
 *
 * This service class is responsible for:
 * - Finding available couriers
 * - Creating and returning Delivery objects
 * - Updating the delivery status as the order progresses
 *
 * It simulates a basic logistics workflow and supports logic that could later
 * be extended to support parallel delivery or tracking features.
 *
 * Concepts reinforced:
 * - Search & filtering logic
 * - Business rules
 * - Control flow and state transitions
 */
public class DeliveryService {

    // List of all couriers available to the system
    private List<Courier> couriers;

    /**
     * Attempts to assign an available courier to the given order.
     *
     * If a courier is found, a Delivery is created and returned.
     * If no couriers are available, returns null or throws an exception (based on design choice).
     *
     * @param order the order that needs to be delivered
     * @return the resulting Delivery object, or null if no couriers available
     */
    public Delivery assignCourier(Order order) {
        for (Courier courier : couriers) {
            if (courier.isAvailable()) {
                courier.toggleAvailability(); // now unavailable
                Delivery delivery = new Delivery(order, courier);
                deliveries.add(delivery);
                return delivery;
            }
        }
        System.out.println("No available couriers for order " + order.getOrderId());
        return null;
        }

    /**
     * Updates the status of an existing delivery.
     *
     * Could be "Pending" → "In Transit" → "Delivered"
     *
     * @param delivery the delivery object to update
     * @param newStatus the new status string
     */
    public void updateDeliveryStatus(Delivery delivery, String newStatus) {
        delivery.setStatus(newStatus);
        System.out.println("Updated delivery for order " + delivery.getOrder().getOrderId() + " to " + newStatus);

        if (newStatus == DeliveryStatus.DELIVERED || newStatus == DeliveryStatus.FAILED) {
            // Make courier available again
            delivery.getCourier().setAvailable(true);
        }
    }

    public List<Delivery> getAllDeliveries() {
        return deliveries;
    }
}

    /**
     * Optional helper method to get all available couriers.
     *
     * Useful for debugging or CLI menus.
     *
     * @return a list of currently available couriers
     */
    public List<Courier> getAvailableCouriers() {
        return couriers;
    }


public void main() {
}

