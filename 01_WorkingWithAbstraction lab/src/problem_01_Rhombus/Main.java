package problem_01_Rhombus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        System.out.println(figurePrinter(n));
    }

    public static String figurePrinter(int n){
        return topHalf(n) + midLane(n) + bottomHalf(n);

    }

    public static String topHalf(int n){
        StringBuilder line = new StringBuilder();
        for (int i = 1; i < n; i++) {
            line.append(appender(" ", n - i))
                    .append(appender("* ", i))
                    .append(System.lineSeparator());
        }
        return line.toString();
    }

    public static String midLane(int n){
        return appender("* ", n) + System.lineSeparator();
    }

    public static String bottomHalf(int n){
        StringBuilder line = new StringBuilder();
        for (int i = 1; i < n; i++) {
            line.append(appender(" ", i))
                    .append(appender("* ", n - i))
                    .append(System.lineSeparator());
        }
        return line.toString();
    }

    public static String appender(String key, int repeats){
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < repeats; i++) {
            line.append(key);
        }
        return line.toString();
    }
}
