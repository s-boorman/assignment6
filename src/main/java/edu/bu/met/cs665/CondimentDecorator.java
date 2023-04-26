/**
 * Name: Stephen Boorman
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/27/2023
 * File Name: CondimentDecorator.java
 * Description: This is abstract class for the condiment decorator for a drink that also extends Drink class
 */
package edu.bu.met.cs665;

/**
 * This is an abstract class that represents a condiment decorator for a drink and extends the Drink class.
 */
public abstract class CondimentDecorator extends Drink {
    /**
     * This is an abstract method that must be implemented by concrete condiment decorator classes to
     * get the description of the decorated drink
     */
    public abstract String getDescription();
}