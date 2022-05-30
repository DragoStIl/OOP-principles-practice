package problem_04;

public class Main {
    public static void main(String[] args) {

        RandomArrayList<Integer> randoms = new RandomArrayList();

        for (int i = 1; i <= 10; i++) {
            randoms.add(i);
        }
        int idk = randoms.getRandomElement();

        System.out.println(idk);
    }
}
