package problem_01_Vehicle;

public class Truck extends Vehicle{

    private final static double AIR_CONDITIONER = 1.6;
    private final static double TANK_WITH_HOLE_CAPACITY = 0.95;

    public Truck(double fuelQuantity, double consumption) {
        super(fuelQuantity, consumption + AIR_CONDITIONER);
    }

    @Override
    void Refueling(double refuelValue) {
        refuelValue = refuelValue * TANK_WITH_HOLE_CAPACITY;
        super.Refueling(refuelValue);
    }
}
