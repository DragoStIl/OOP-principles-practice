package problem_03;

public class Bulgarian extends BasePerson{

    public Bulgarian(String name){
        super(name);
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
}
