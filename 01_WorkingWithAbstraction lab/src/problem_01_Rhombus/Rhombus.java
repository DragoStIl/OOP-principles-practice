package problem_01_Rhombus;

public class Rhombus {
    private int n;


    public Rhombus(int n) {
        this.n = n;
    }

    public String printFigure() {
       return topHalf() +        midLine() +
        bottomHalf();
    }

    private String bottomHalf() {
        StringBuilder line = new StringBuilder();
        for (int i = 1; i < n; i++) {
            line.append(appender(" ", i)).append(appender("* ", n - i)).append(System.lineSeparator());

        }
        return line.toString();
    }

    private String midLine() {
        StringBuilder line = new StringBuilder(appender("* ", n)).append(System.lineSeparator());
        return line.toString();
    }

    private String topHalf() {
        StringBuilder line = new StringBuilder();
        for (int i = 1; i < n; i++) {
            line.append(appender(" ", n - i)).append(appender("* ", i))
                    .append(System.lineSeparator());


        }
        return line.toString();
    }


    private String appender(String key, int n){
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < n; i++) {
            line.append(key);
        }
        return line.toString();
    }

}
