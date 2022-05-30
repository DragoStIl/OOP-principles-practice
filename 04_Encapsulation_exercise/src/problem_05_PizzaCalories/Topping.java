package problem_05_PizzaCalories;

import java.util.Set;

public class Topping {

    private String type;
    private double weight;

    public Topping(String type, double weight) {
        setType(type);
        setWeight(weight);
    }
    private void setType(String type) {

        boolean weHaveIt = doWeHaveThatTopping(type);
        if (!weHaveIt){
            throw new IllegalArgumentException("Cannot place " + type + " on top of your pizza.");
        }

        this.type = type;
    }

    private void setWeight(double weight) {
        if (weight <= 0 || weight > 50 ){
            throw new IllegalArgumentException(this.type + " weight should be in the range [1..50].");
        }

        this.weight = weight;
    }

    public double calculateCalories() {
        double modifier = 0;
        switch (this.type){
            // Meat – 1.2;
            case "Meat":
                modifier = 1.2;
                break;
                // Veggies – 0.8;
            case "Veggies":
                modifier = 0.8;
                break;
                // Cheese – 1.1;
            case "Cheese":
                modifier = 1.1;
                break;
                // Sauce – 0.9;
            case "Sauce":
                modifier = 0.9;
                break;
        }
        return (2 * this.weight) * modifier;
    }

    private boolean doWeHaveThatTopping(String type) {
        Set<String> toppingsWeOffer = Set.of("Meat", "Veggies", "Cheese", "Sauce");
        return toppingsWeOffer.contains(type);
    }

}
