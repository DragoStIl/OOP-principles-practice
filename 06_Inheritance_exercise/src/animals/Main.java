package animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String animalType = scan.nextLine();

        while (!animalType.equals("Beast!")) {

            String[] animalInfo = scan.nextLine().split(" ");
            String name = animalInfo[0];
            int age = Integer.parseInt(animalInfo[1]);
            String gender = animalInfo[2];

            try {
                switch (animalType) {
                    case "Dog":
                        Dog dog = new Dog(name, age, gender);
                        System.out.println(dog);
                        break;
                    case "Frog":
                        Frog frog = new Frog(name, age, gender);
                        System.out.println(frog);
                        break;
                    case "Cat":
                        Cat cat = new Cat(name, age, gender);
                        System.out.println(cat);
                        break;
                    case "Tomcat":
                        Tomcat tomcat = new Tomcat(name, age);
                        System.out.println(tomcat);
                        break;
                    case "Kitten":
                        Kitten kitten = new Kitten(name, age);
                        System.out.println(kitten);
                        break;

                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            animalType = scan.nextLine();
        }
    }
}
