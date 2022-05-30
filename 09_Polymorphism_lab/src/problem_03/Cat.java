package problem_03;

public class Cat extends Animal{

    String name;
    String favouriteFood;

    public Cat(String name, String favoriteFood) {
        super(name, favoriteFood);
    }

    @Override
    String explainSelf() {
        return super.explainSelf() + System.lineSeparator() + "MEEOW";
    }
}
