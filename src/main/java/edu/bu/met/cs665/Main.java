/**
 * Name: Stephen Boorman
 * Course: CS-665 Software Designs & Patterns
 * Date: 04/27/2023
 * File Name: Main.java
 * Description: This is the main class for this program
 */

package edu.bu.met.cs665;

public class Main {



    /**
     * A main method to run examples.
     *
     * @param args
     */
    public static void main(String[] args) {

        Espresso drink1 = new Espresso();
        System.out.println(drink1.getDescription());

        Milk drink2 = new Milk(drink1, 1);
        System.out.println(drink2.getDescription());



    }
}
