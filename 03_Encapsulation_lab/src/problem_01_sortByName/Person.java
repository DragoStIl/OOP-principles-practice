package problem_01_sortByName;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String secondName, int age, double salary) {
        setFirstName(firstName);
        setLastName(secondName);
        setAge(age);
        setSalary(salary);
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void increaseSalary(double bonus) {
        if (this.age < 30){
            setSalary(this.salary * (1 + bonus / 200));
        } else {
            setSalary(this.salary * (1 + bonus / 100));
        }
    }

    public double getSalary() {
        return this.salary;
    }

    public void setFirstName(String firstName) {
        boolean length = lengthChecker(firstName);
        if (!length){
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
        this.firstName = firstName;

    }

    public void setLastName(String lastName) {
        boolean length = lengthChecker(lastName);
        if (!length){
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age <= 0){
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    private boolean lengthChecker(String name) {
        return (name.length() >= 3);
    }

    public void setSalary(double salary) {
        if (salary < 460) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }


    @Override
    public String toString() {
        return String.format("%s %s gets %f leva", getFirstName(), getLastName() , getSalary());
    }
}
