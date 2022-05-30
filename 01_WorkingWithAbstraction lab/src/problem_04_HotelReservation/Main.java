package problem_04_HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] tokens = scan.nextLine().split("\\s+");
        double price = Double.parseDouble(tokens[0]);
        int days = Integer.parseInt(tokens[1]);
        Seasons season = Seasons.valueOf(tokens[2].toUpperCase());
        Discounts type = Discounts.valueOf(tokens[3].toUpperCase());

        VacationPriceCalculator vacation = new VacationPriceCalculator(price, days, season, type);

        System.out.println(vacation.getPricePerDay());
    }

}
