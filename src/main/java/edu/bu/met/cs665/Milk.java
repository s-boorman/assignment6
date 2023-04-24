package edu.bu.met.cs665;

public class Milk extends CondimentDecorator {
    Drink drink;

    private int milks;

    public Milk(Drink drink, int milks) {
        this.drink = drink;
        this.milks = milks;
    }

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
