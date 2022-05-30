package problem_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        List<Birthable> thoseWhoHaveBirthdays = new ArrayList<>();

        while (!input.equals("End")){
            String type = input.split(" ")[0];
            if (type.equals("Citizen")){
                String name = input.split(" ")[1];
                int age = Integer.parseInt(input.split(" ")[2]);
                String id = input.split(" ")[3];
                String birthDate = input.split(" ")[4];
                Birthable person = new Citizen(name, age, id, birthDate);
                thoseWhoHaveBirthdays.add(person);
            } else if (type.equals("Pet")){
                String name = input.split(" ")[1];
                String birthDate = input.split(" ")[2];
                Birthable pet = new Pet(name, birthDate);
                thoseWhoHaveBirthdays.add(pet);
            }
            input = scan.nextLine();
        }

        input = scan.nextLine();
        for (Birthable livingThing : thoseWhoHaveBirthdays) {
            String birtYear = livingThing.getBirthDate().split("/")[2];
            if(birtYear.equals(input)){
                System.out.println(livingThing.getBirthDate());
            }
        }


    }
}
