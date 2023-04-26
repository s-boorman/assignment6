/**
 * Name: Stephen Boorman
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/27/2023
 * File Name: Milk.java
 * Description: This is the Milk decorator class
 */
package edu.bu.met.cs665;

/**
 * This class represents a milk condiment decorator for a drink, which extends the CondimentDecorator class.
 */

public class Milk extends CondimentDecorator {
    /**
     * variable that holds a reference to the Drink object being decorated
     */
    Drink drink;
    /**
     * variable that holds the number of milks being added to the drink
     */
    private int milks;

    /**
     * Constructor for the Milk class that takes in the Drink object to be decorated and the number of milks being added.
     * @param drink What drink is going to be decorated
     * @param milks how many (if any) milks the drink will be decorated with
     */
    public Milk(Drink drink, int milks) {
        this.drink = drink;
        this.milks = milks;
    }

    /**
     * Overridden method from the CondimentDecorator class that returns the description of
     * the decorated drink with the milk added.
     * @return String description of the drink and what Milk properties that have been added
     */
    public String getDescription() {
        if (milks <= 3 && milks > 0) {
            return drink.getDescription() + " +" + milks + " Milk";
        } else if (milks > 3) {
            return drink.getDescription() + " +3 Milk";
        } else {
            return drink.getDescription() + " + No Milk";
        }
    }
}
