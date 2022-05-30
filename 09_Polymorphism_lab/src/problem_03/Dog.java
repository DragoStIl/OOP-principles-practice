package problem_03;

public class Dog extends Animal{

    String name;
    String favouriteFood;

    public Dog(String name, String favoriteFood) {
        super(name, favoriteFood);
    }

    @Override
    String explainSelf() {
        return super.explainSelf() + System.lineSeparator() + "DJAAF";

    }
}
