package problem_01_Vehicle;

import java.text.DecimalFormat;

public abstract class Vehicle {

    private final double fuelQuantity;
    private double currentFuel;
    private final double consumption;
    public Vehicle(double fuelQuantity, double consumption) {
        this.fuelQuantity = fuelQuantity;
        this.consumption = consumption;
        this.currentFuel = fuelQuantity;
    }

    public double getCurrentFuel() {
        return currentFuel;
    }

    void Driving(double kilometresToDrive){

        DecimalFormat formatter = new DecimalFormat("0.####");
        if (kilometresToDrive * this.consumption <= currentFuel){
            System.out.printf("%s travelled %s km%n", this.getClass().getSimpleName(), formatter.format(kilometresToDrive));
            currentFuel -= kilometresToDrive * consumption;
        } else {
            System.out.printf("%s needs refueling%n", this.getClass().getSimpleName());
        }
    }

     void Refueling(double refuelValue){
//        if (currentFuel + refuelValue > fuelQuantity){
//            currentFuel = fuelQuantity;
//        } else {
//        }
         currentFuel += refuelValue;
     }
}
