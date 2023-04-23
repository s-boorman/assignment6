package edu.bu.met.cs665;

public class TeaMachine extends Drink{
    private String drink;
    String[] drinkOptions = {"Black Tea", "Green Tea" , "Yellow Tea"};

    /**
     *will be brewed if it is a drink option.
     * @param selectedDrink string of drink.
     */
    public void brewDrink(String selectedDrink) {
        for (String i : drinkOptions) {
            if (i.equals(selectedDrink)) {
                drink = selectedDrink;
            }
        }
    }

    /**
     * returns drink.
     * @return string drink.
     */
    public String getDrink(){
        return drink;
    }
}
