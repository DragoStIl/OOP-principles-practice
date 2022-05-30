package problem_01_Vehicle;

public class Car extends Vehicle{

    private final static double AIR_CONDITIONER = 0.9;
    public Car(double fuelQuantity, double consumption) {
        super(fuelQuantity, consumption + AIR_CONDITIONER);
    }



}
