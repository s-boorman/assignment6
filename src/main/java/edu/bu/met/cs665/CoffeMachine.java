package edu.bu.met.cs665;

public class CoffeMachine extends Drink {

     private String drink;
    String[] drinkOptions = {"Espresso", "Americano", "Latte Macchiato"};

    /**
     * drink will be brewed if it's a drink option.
     * @param selectedDrink is the desired drink
     */
    public void brewDrink(String selectedDrink) {
        for (String i : drinkOptions) {
            if (i.equals(selectedDrink)) {
                drink = selectedDrink;
            }
        }
    }

    /**
     * returns the drink.
     * @return string drink
     */
    public String getDrink(){
        return drink;
    }
}
