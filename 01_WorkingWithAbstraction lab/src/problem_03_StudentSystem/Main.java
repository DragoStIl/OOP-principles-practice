package problem_03_StudentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StudentSystem registry = new StudentSystem();



        String[] input = scan.nextLine().split(" ");

        while (!input[0].equals("Exit")) {

            if (input[0].equals("Create")) {
                create(registry, input);
            } else if (input[0].equals("Show")) {
                System.out.println(show(registry, input));
            }

            input = scan.nextLine().split(" ");
        }

    }

    public static void create(StudentSystem registry, String[] input){
        String name = input[1];
        int age = Integer.parseInt(input[2]);
        double grade = Double.parseDouble(input[3]);
        if (!registry.getRegistry().containsKey(name))
        {
            Student student = new Student(name, age, grade);
            registry.getRegistry().put(name,student);
        }

    }

    public static String show(StudentSystem registry, String[] input){
        StringBuilder view = new StringBuilder();
        String name = input[1];
        if (registry.getRegistry().containsKey(name)) {
            Student student = registry.getRegistry().get(name);
            view.append(student.getName())
                    .append(" is ")
                    .append(student.getAge())
                    .append(" years old.");

            if (student.getGrade() >= 5.00) {
                view.append(" Excellent student.");
            } else if (student.getGrade() >= 3.50) {
                view.append(" Average student.");
            }
            else {
                view.append(" Very nice person.");
            }

        }
        return view.toString();
    }
}
