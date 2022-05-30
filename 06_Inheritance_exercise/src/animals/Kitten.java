package animals;

public class Kitten extends Cat{

    private static final String GENDER = "Female";
    public Kitten(String name, int age) {
        super(name, age, GENDER);
    }

    @Override
    protected String produceSound() {
        return "Meow";
    }
}
