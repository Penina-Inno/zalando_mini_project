package com.zalando.lite;

import java.util.List;
import com.zalando.lite.annotations.Featured;

/**
 * Represents a product in the ZalandoLite fashion store.
 *
 * Each product has:
 * - A unique ID
 * - A name and category
 * - A price
 * - Current stock level
 * - A list of available sizes (e.g., S, M, L)
 *
 * Some products may also be marked with the {@link Featured} annotation
 * to indicate they are promoted or highlighted in the catalog.
 *
 * Concepts reinforced:
 * - POJO modeling
 * - Encapsulation
 * - Lists
 * - Annotation usage
 */
public class Product {

    // Unique identifier for the product
    private int id;

    // Product name (e.g., "Leather Jacket")
    private String name;

    // Category for grouping (e.g., "Shoes", "Accessories", "Jackets")
    private String category;

    // Price of the product
    private double price;

    // Quantity in stock (used by InventoryManager and OrderManager)
    private int stock;

    // List of size options (e.g., "S", "M", "L")
    private List<String> availableSizes;

    /**
     * Constructor to initialize the product fields.
     * Used during product setup or inventory population.
     */

    // Getter and setter for ID
    public int getId() { /* ... */ }
    public void setId(int id) { /* ... */ }

    // Getter and setter for name
    public String getName() { /* ... */ }
    public void setName(String name) { /* ... */ }

    // Getter and setter for category
    public String getCategory() { /* ... */ }
    public void setCategory(String category) { /* ... */ }

    // Getter and setter for price
    public double getPrice() { /* ... */ }
    public void setPrice(double price) { /* ... */ }

    // Getter and setter for stock quantity
    public int getStock() { /* ... */ }
    public void setStock(int stock) { /* ... */ }

    // Getter and setter for size options
    public List<String> getAvailableSizes() { /* ... */ }
    public void setAvailableSizes(List<String> sizes) { /* ... */ }

    /**
     * Optional method to check if the product is out of stock.
     *
     * @return true if stock is zero or less
     */
    public boolean isOutOfStock() { /* ... */ }

    /**
     * Returns a string summary of the product’s details.
     */
    @Override
    public String toString() { /* ... */ }
}
