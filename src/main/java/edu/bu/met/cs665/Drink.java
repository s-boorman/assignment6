/**
 * Name: Stephen Boorman
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/27/2023
 * File Name: Drink.java
 * Description: This is abstract class for the condiment decorator for a drink that also extends Drink class
 */
package edu.bu.met.cs665;

/**
 * This is an abstract class that represents Drink and has a getDescription() method
 */
public abstract class Drink {
    /**
     * Attribute String of "Drink"
     */
    String description = "Drink ";

    /**
     * A method that returns what the Drink is
     * @return String description of Drink
     */
    public String getDescription() {
        return description;
    }
}
