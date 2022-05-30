package problem_04_HotelReservation;

public enum Discounts {
    VIP(0.8),
    SECONDVISIT(0.9),
    NONE(1);

    private String name;
    private double discount;
    Discounts(double discount){
        this.discount = discount;
    }
    public double getDiscount() {
        return discount;
    }
}
