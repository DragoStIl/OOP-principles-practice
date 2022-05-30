package problem_04;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numberOfTownsmen = Integer.parseInt(scan.nextLine());
        Map<String, Buyer> thoseWhoEat = new HashMap<>();

        while (numberOfTownsmen-- > 0){
            String[] humanInfo = scan.nextLine().split(" ");
            if (humanInfo.length == 4){
                String name = humanInfo[0];
                int age = Integer.parseInt(humanInfo[1]);
                String id = humanInfo[2];
                String birthDate = humanInfo[3];
                Buyer citizen = new Citizen(name, age, id, birthDate);
                thoseWhoEat.put(name, citizen);
            } else if (humanInfo.length == 3){
                String name = humanInfo[0];
                int age = Integer.parseInt(humanInfo[1]);
                String group = humanInfo[2];
                Buyer rebel = new Rebel(name, age, group);
                thoseWhoEat.put(name, rebel);
            }
        }
        String name = scan.nextLine();
        while (!name.equals("End")){
            if (thoseWhoEat.containsKey(name)){
                thoseWhoEat.get(name).buyFood();
            }

            name = scan.nextLine();
        }
        System.out.println(thoseWhoEat.values().stream().mapToInt(Buyer::getFood).sum());
//        int sum = thoseWhoEat.values().stream().mapToInt(Buyer::getFood).sum();

    }
}
