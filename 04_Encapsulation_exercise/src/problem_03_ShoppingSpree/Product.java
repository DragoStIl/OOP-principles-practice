package problem_03_ShoppingSpree;

public class Product {

    private String name;
    private double cost;

    public Product(String name, double price){
        setName(name);
        setCost(price);
    }

    private void setName(String name){
        if (name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setCost(double cost){
        if (cost < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.cost = cost;
    }

    public String getName() {
        return this.name;
    }

    public double getCost() {
        return this.cost;
    }
}
