package restaurant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage{

    private final static double COFFEE_MILLILITERS = 50;
    private final static BigDecimal COFFEE_PRICE = BigDecimal.valueOf(3.5);
    private double caffeine;

    public Coffee(String name, BigDecimal price, double millilitres, double caffeine) {
        super(name, price, millilitres);
        this.caffeine = caffeine;
    }

    public double getCaffeine() {
        return caffeine;
    }

    public double getCoffeeMilliliters(){
        return COFFEE_MILLILITERS;
    }

    public BigDecimal getCoffeePrice(){
        return COFFEE_PRICE;
    }
}
