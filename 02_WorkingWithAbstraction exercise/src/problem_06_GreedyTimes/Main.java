package problem_06_GreedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        long bagSize = Long.parseLong(scan.nextLine());

        String[] safe = scan.nextLine().split("\\s+");

        Map<String, Map<String, Long>> bag = new LinkedHashMap<>();

        for (int i = 0; i < safe.length; i += 2) {
            String name = safe[i];
            long number = Long.parseLong(safe[i + 1]);

            String itemType = null;

            if (name.length() == 3) {
                itemType = "Cash";
            } else if (name.toLowerCase().endsWith("gem")) {
                itemType = "Gem";
            } else if (name.toLowerCase().equals("gold")) {
                itemType = "Gold";
            }

            boolean notEnoughSpace = bagSize < bag.values()
                    .stream()
                    .map(Map::values)
                    .flatMap(Collection::stream)
                    .mapToLong(e -> e).sum() + number;

            if (itemType == null) {
                continue;
            } else if (notEnoughSpace) {
                continue;
            }

            switch (itemType) {
                case "Gem":
                    if (!bag.containsKey(itemType)) {
                        if (bag.containsKey("Gold")) {
                            if (number > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bag.get(itemType).values().stream().mapToLong(e -> e).sum() + number > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
                case "Cash":
                    if (!bag.containsKey(itemType)) {
                        if (bag.containsKey("Gem")) {
                            if (number > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bag.get(itemType).values().stream().mapToLong(e -> e).sum() + number > bag.get("Gem").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
            }

            if (!bag.containsKey(itemType)) {
                bag.put((itemType), new LinkedHashMap<>());
            }

            if (!bag.get(itemType).containsKey(name)) {
                bag.get(itemType).put(name, 0L);
            }


            bag.get(itemType).put(name, bag.get(itemType).get(name) + number);

        }

        bag.forEach((key, value) -> {
            System.out.printf("<%s> $%s%n", key, value.values().stream().mapToLong(n -> n).sum());
            value.entrySet()
                    .stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey()))
                    .forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));
        });
    }
}