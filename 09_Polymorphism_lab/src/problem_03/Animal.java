package problem_03;

public abstract class Animal {

    String name;
    String favouriteFood;

    public Animal(String name, String favoriteFood) {
        this.name = name;
        this.favouriteFood = favoriteFood;
    }

    String explainSelf(){
        return String.format("I am %s and my favourite food is %s", this.name, this.favouriteFood);
    }

}
