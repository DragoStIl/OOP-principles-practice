package restaurant;

import java.math.BigDecimal;

public class Cake extends Dessert{

    public final static double CAKE_GRAMS = 250;
	public final static double CAKE_CALORIES = 1000;
	public final static BigDecimal CAKE_PRICE = BigDecimal.valueOf(5);


    public Cake(String name, BigDecimal price, double grams, double calories) {
        super(name, price, grams, calories);
    }

    public double getCakeGrams() {
        return CAKE_GRAMS;
    }

    public double getCakeCalories(){
        return CAKE_CALORIES;
    }

    public BigDecimal getCakePrice(){
        return CAKE_PRICE;
    }
}
