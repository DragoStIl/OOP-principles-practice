package problem_04_HotelReservation;

public enum Seasons {
    AUTUMN(1, "Autumn"),
    SPRING(2, "Spring"),
    WINTER(3, "Winter"),
    SUMMER(4, "Summer");

    private int multiplayer;
    private String name;

    Seasons(int multiplayer, String name){
        this.multiplayer = multiplayer;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getMultiplayer(){
        return multiplayer;
    }

}
