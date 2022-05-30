package problem_01;

public class Seat extends CarImpl implements Sellable {

    private Double price;

    public Seat(String model, String color, Integer horsePower, String countryOfProduction, Double price) {
        super(model, color, horsePower, countryOfProduction);
        this.price = price;

    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return super.toString()
                + System.lineSeparator()
                + String.format("%s sells for %f"
                , getModel(), getPrice());
    }
}
