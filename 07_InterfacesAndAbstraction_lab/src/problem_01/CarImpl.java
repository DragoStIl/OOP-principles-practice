package problem_01;

public  class CarImpl implements Car {

    private String model;
    private String color;
    private Integer horsePower;
    private String countryProduction;

    public CarImpl(String model, String color, Integer horsePower, String countryProduction){

        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduction = countryProduction;
    }

    @Override
    public String toString() {

        return String.format("This is %s produced in %s and have %d tires"
                , getModel(), countryProduced(), TIRES);
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String countryProduced() {
        return this.countryProduction;
    }
}
