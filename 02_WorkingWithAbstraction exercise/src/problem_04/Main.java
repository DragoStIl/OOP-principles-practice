package problem_04;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        List<String> input = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toList());
        int rotations = Integer.parseInt(scan.nextLine());

        while (rotations-- > 0){
            input = flashlights(input);
            System.out.println(String.join(" ", input));
        }

    }

    public static List<String> flashlights(List<String> lights) {
        List<String> swapped = new ArrayList<>();
        for (String light : lights) {
            switch (light) {
                case "RED":
                    swapped.add("GREEN");
                    break;
                case "GREEN":
                    swapped.add("YELLOW");
                    break;
                case "YELLOW":
                    swapped.add("RED");
                    break;
            }
        }
        return swapped;
    }

}
