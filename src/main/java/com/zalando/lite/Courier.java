package com.zalando.lite;

/**
 * Represents a courier who delivers customer orders.
 *
 * This class is part of the delivery system in ZalandoLite. Couriers are
 * assigned to orders based on their availability status. Each courier has a
 * vehicle and a toggleable state to simulate real-world assignment.
 *
 * Useful in logistics simulation and multithreading (optional bonus).
 *
 * Concepts reinforced:
 * - POJO modeling
 * - Encapsulation
 * - State toggling with booleans
 */
public class Courier {

    // Unique identifier for the courier
    private int id;

    // Full name of the courier
    private String name;

    // Type of vehicle (e.g., Bike, Van, Drone)
    private String vehicleType;

    // True if courier is available for assignment
    private boolean available;

    /**
     * Constructor to initialize a Courier.
     * Typically used when creating a list of couriers at app startup.
     */

    // Returns the courier ID
    public int getId() { /* ... */ }

    // Sets the courier ID
    public void setId(int id) { /* ... */ }

    // Returns the name of the courier
    public String getName() { /* ... */ }

    // Sets the courier's name
    public void setName(String name) { /* ... */ }

    // Returns the type of vehicle used for delivery
    public String getVehicleType() { /* ... */ }

    // Sets the vehicle type (used for logistics filtering)
    public void setVehicleType(String vehicleType) { /* ... */ }

    // Returns true if courier is available for delivery
    public boolean isAvailable() { /* ... */ }

    // Updates the courier's availability status
    public void setAvailable(boolean available) { /* ... */ }

    /**
     * Toggles the courier's availability.
     *
     * Used to simulate assignment (available → busy) or completion (busy → available).
     * A simple, clean way to change internal boolean state.
     */
    public void toggleAvailability() { /* ... */ }

    /**
     * Returns a formatted string of courier details.
     * Useful for logging or menu displays.
     */
    @Override
    public String toString() { /* ... */ }
}
