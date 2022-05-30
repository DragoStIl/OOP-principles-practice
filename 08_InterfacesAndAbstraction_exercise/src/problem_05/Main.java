package problem_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        List<String>  numbers = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());
        List<String> urls = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());

        Smartphone smartphone = new Smartphone(numbers, urls);

        String phonebook = smartphone.call();
        String browsing = smartphone.browse();
        if (!phonebook.trim().isEmpty()){
            System.out.println(phonebook);
        }
        if (!browsing.trim().isEmpty()){
            System.out.println(browsing);
        }

    }

}
