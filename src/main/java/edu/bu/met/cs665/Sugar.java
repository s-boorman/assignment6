package edu.bu.met.cs665;

public class Sugar extends CondimentDecorator {
    Drink drink;

    private int sugars;

    public Sugar(Drink drink, int sugars) {
        this.drink = drink;
        this.sugars = sugars;
    }

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
