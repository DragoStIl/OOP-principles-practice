package problem_01_sortByName;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        List<Person> people = new ArrayList<>();

        while (n-- > 0) {
            String[] input = reader.readLine().split("\\s+");

            String firstNAme = input[0];
            String secondName = input[1];
            String age = input[2];
            String salary = input[3];

            people.add(new Person(firstNAme, secondName, Integer.parseInt(age), Double.parseDouble(salary)));
        }

//        double bonus = Double.parseDouble(reader.readLine());
//        DecimalFormat formatter = new DecimalFormat("#.0####");

        Team team = new Team("Black Eagles");

        for (Person person : people) {
            team.addPlayer(person);
        }
        System.out.printf("First team have %d players%nReserve team have %d players"
                , team.getFirstTeam().size(), team.getReserveTeam().size());

    }
}
