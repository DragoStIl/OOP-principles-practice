package animals;

public class Dog extends Animal{

    private String name;
    private int age;
    private String gender;

    public Dog(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    protected String produceSound() {
        return "Woof!";
    }
}
