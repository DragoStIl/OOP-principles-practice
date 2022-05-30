package problem_05_PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String name;
    private Dough dough;
    List<Topping> toppings;


    public Pizza(String name, int numberOfToppings){
        setName(name);
        setTopping(numberOfToppings);

    }

    private void setName(String name) {
        if (name.trim().isEmpty() || name.length() > 15){
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    private void setTopping(int number){
        if (number < 0 || number > 10){
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }

        this.toppings = new ArrayList<>();
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public String getName() {
        return name;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public double getOverallCalories() {

        double sum = this.dough.calculateCalories();
        for (Topping topping : toppings) {
            sum += topping.calculateCalories();
        }
        return sum;
    }
}
