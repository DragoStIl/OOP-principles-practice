package problem_03_ShoppingSpree;

import java.util.*;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        Map<String, Person> people = new LinkedHashMap<>();
        Map<String, Product> products = new HashMap<>();

        String[] peopleData = scan.nextLine().split(";");
        for (String peopleDatum : peopleData) {
            String name = peopleDatum.split("=")[0];
            double money = Double.parseDouble(peopleDatum.split("=")[1]);

            try {
                Person person = new Person(name, money);
                people.put(name, person);
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
                return;
            }
        }

        String[] productData = scan.nextLine().split(";");
        for (String productDatum : productData) {
            String name = productDatum.split("=")[0];
            double price = Double.parseDouble(productDatum.split("=")[1]);

            try {
                Product product = new Product(name, price);
                 products.put(name, product);
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
                return;
            }
        }

        String input = scan.nextLine();
        while (!input.equals("END")){

            String client = input.split(" ")[0];
            String article = input.split(" ")[1];
            try {
                people.get(client).buyProduct(products.get(article));

            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

            input = scan.nextLine();
        }

        for (Person person : people.values()) {
            System.out.print(person.getName() + " - ");
            if (person.getProducts().isEmpty()) {
                System.out.println("Nothing Bought");
            } else {
                System.out.println(person.getProducts()
                        .stream().map(Product::getName)
                        .collect(Collectors.joining(", ")));
            }
        }

    }
}
