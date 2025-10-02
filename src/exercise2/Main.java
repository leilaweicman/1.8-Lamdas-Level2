package exercise2;

import common.ListUtilsService;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> names = Arrays.asList(1, 2, 3, 4, 5);

        String result = ListUtilsService.formatNumbers(names);

        System.out.println("Formatted numbers: " + result);
    }
}
