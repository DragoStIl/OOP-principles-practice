package problem_05;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements Callable, Browsable{

    List<String> numbers;
    List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public List<String> getUrls() {
        return urls;
    }

    @Override
    public String call() {
        StringBuilder phoneBook = new StringBuilder();
        for (String number : numbers) {
            int isNumber = filter(number);
            if (isNumber == 0) {
                phoneBook.append("Calling... ")
                        .append(number)
                        .append(System.lineSeparator());
            } else {
                phoneBook.append("Invalid number!").append(System.lineSeparator());
            }
        }
        return phoneBook.toString().trim();
    }

    @Override
    public String browse() {
        StringBuilder urlBook = new StringBuilder();
            for (String url : this.urls) {
                int isUrl = filter(url);
                if (isUrl == url.length() && !url.trim().isEmpty()) {
                    urlBook.append("Browsing: ")
                            .append(url)
                            .append("!")
                            .append(System.lineSeparator());
                } else if (isUrl < url.length()) {
                    urlBook.append("Invalid URL!")
                            .append(System.lineSeparator());
                }
            }
        return urlBook.toString().trim();
    }

    private int filter(String line) {
        int contains = 0;
        for (int i = 0; i < line.length(); i++) {
            if (!Character.isDigit(line.charAt(i))){
                contains++;
            }
        }
        return contains;
    }
}
