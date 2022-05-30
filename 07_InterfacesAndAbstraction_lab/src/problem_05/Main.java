package problem_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] tokens = scan.nextLine().split("\\s+");

        List<Identifiable> cityMembers = new ArrayList<>();

        while (!tokens[0].equals("End")){
            if (tokens.length == 2){
                Identifiable robot = new Robot(tokens[0], tokens[1]);
                cityMembers.add(robot);
            } else {
                Identifiable citizen = new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                cityMembers.add(citizen);
            }

            tokens = scan.nextLine().split("\\s+");
        }
        String illegalMembers = scan.nextLine();

        for (Identifiable cityMember : cityMembers) {
            String id = cityMember.getId();
            if (id.endsWith(illegalMembers)){
                System.out.println(id);
            }
        }
    }
}
