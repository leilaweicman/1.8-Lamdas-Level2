package exercise1;

import common.ListUtilsService;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Ada", "Alex", "Al", "Bob", "Amy");

        List<String> result = ListUtilsService.filterNamesStartingWithAAndLength3(names);

        System.out.println("Names starting with 'A' and 3 letters long: " + result);
    }
}
