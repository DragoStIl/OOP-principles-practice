package problem_01_Vehicle;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String carData = scan.nextLine();
        double carFuelQuantity = Double.parseDouble(carData.split(" ")[1]);
        double carConsumption = Double.parseDouble(carData.split(" ")[2]);
        Vehicle car = new Car(carFuelQuantity, carConsumption);

        String truckData = scan.nextLine();
        double truckFuelQuantity = Double.parseDouble(truckData.split(" ")[1]);
        double truckConsumption = Double.parseDouble(truckData.split(" ")[2]);
        Vehicle truck = new Truck(truckFuelQuantity, truckConsumption);


        int commands = Integer.parseInt(scan.nextLine());

        while (commands-- > 0){
            String[] tokens = scan.nextLine().split(" ");
            String action = tokens[0];
            String vehicle = tokens[1];
            double value = Double.parseDouble(tokens[2]);

            if (vehicle.equals("Truck")){
                commandPerformer(truck, action, value);
            } else {
                commandPerformer(car, action, value);
            }


        }
        DecimalFormat formatter = new DecimalFormat("##,##");
        System.out.printf("Car: %.2f%n", car.getCurrentFuel());
        System.out.printf("Truck: %.2f%n",truck.getCurrentFuel());
    }

    public static void commandPerformer(Vehicle vehicle, String command, double value){
        if (command.equals("Drive")){
            vehicle.Driving(value);
        } else {
            vehicle.Refueling(value);
        }
    }
}
