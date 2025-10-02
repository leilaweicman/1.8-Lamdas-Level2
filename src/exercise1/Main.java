package exercise1;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Ada", "Alex", "Al", "Bob", "Amy");

        System.out.println(names.stream()
                .filter(name -> name.startsWith("A"))
                .filter(name -> name.length() == 3)
                .toList());
    }
}
