package problem_05_JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] dimensions = coordinates(scan.nextLine());
        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] galaxy = new int[rows][cols];
        galaxyFiller(galaxy);


        String command = scan.nextLine();
        long stars = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] jediPosition = coordinates(command);
            int[] evilPosition = coordinates(scan.nextLine());

            int evilRow = evilPosition[0];
            int evilCol = evilPosition[1];

            evilPath(galaxy, evilRow, evilCol);

            int jediRow = jediPosition[0];
            int jediCol = jediPosition[1];

            stars += jediPath(galaxy, jediRow, jediCol);

            command = scan.nextLine();
        }

        System.out.println(stars);
    }

    private static int[] coordinates(String command) {
        return Arrays.stream(command.split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }

    private static long jediPath(int[][] matrix, int jediRow, int jediCol) {
        long starsSum = 0;
        while (jediRow >= 0 && jediCol < matrix[0].length) {
            if (inBounds(matrix, jediRow, jediCol)) {
                starsSum += matrix[jediRow][jediCol];
            }

            jediCol++;
            jediRow--;
        }
        return starsSum;
    }

    private static void evilPath(int[][] matrix, int evilRow, int evilCol) {
        while (evilRow >= 0 && evilCol >= 0) {
            if (inBounds(matrix, evilRow, evilCol)) {
                matrix[evilRow][evilCol] = 0;
            }
            evilRow--;
            evilCol--;
        }
    }

    private static void galaxyFiller(int[][] matrix) {
        int value = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = value++;
            }
        }
    }

    public static boolean inBounds(int[][] matrix,int row,int col) {
        return (row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length);
    }
}
