package problem_04_HotelReservation;

public class VacationPriceCalculator {
    double pricePerDay;
    int days;
    Seasons season;
    Discounts type;


    public VacationPriceCalculator(double pricePerDay, int days, Seasons season, Discounts type) {
        this.pricePerDay = pricePerDay;
        this.days = days;
        this.season = season;
        this.type = type;
    }

    public String getPricePerDay(){
        return String.format("%.2f", pricePerDay * days * season.getMultiplayer() * type.getDiscount());
    }
}
