/**
 * Name: Stephen Boorman
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/27/2023
 * File Name: Sugar.java
 * Description: This is the Sugar decorator class
 */
package edu.bu.met.cs665;
/**
 * This class represents a Sugar condiment decorator for a drink, which extends the CondimentDecorator class.
 */

public class Sugar extends CondimentDecorator {
    /**
     * variable that holds a reference to the Drink object being decorated
     */
    Drink drink;
    /**
     * variable that holds the number of sugars being added to the drink
     */

    private int sugars;
    /**
     * Constructor for the Sugar class that takes in the Drink object to be decorated and the number of sugars
     * being added.
     * @param drink What drink is going to be decorated
     * @param sugars how many (if any) milks the drink will be decorated with
     */
    public Sugar(Drink drink, int sugars) {
        this.drink = drink;
        this.sugars = sugars;
    }
    /**
     * Overridden method from the CondimentDecorator class that returns the description of
     * the decorated drink with the sugar added.
     * @return String description of the drink and what sugar properties that have been added
     */
    public String getDescription() {
        if (sugars <= 3 && sugars > 0) {
            return drink.getDescription() + " +" + sugars + " Sugar";
        } else if (sugars > 3) {
            return drink.getDescription() + " +3 Sugar";
        } else {
            return drink.getDescription() + " + No Sugar";
        }
    }
}
