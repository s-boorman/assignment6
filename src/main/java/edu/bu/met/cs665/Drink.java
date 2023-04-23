package edu.bu.met.cs665;

public class Drink {
    private int milk = 0;
    private int sugar = 0;

    /**
     * adds milk condiment to drink with a max of 3.
     */
    public void addMilk() {
        if (milk < 3) {
            milk++;
        }
    }
    /**
     * adds sugar condiment to drink with a max of 3.
     */
    public void addSugar() {
        if (sugar < 3) {
            sugar++;
        }
    }
    /**
     * returns total number of condiments in drink.
     */
    public int getTotalCondiments() {
        return sugar + milk;
    }
}
