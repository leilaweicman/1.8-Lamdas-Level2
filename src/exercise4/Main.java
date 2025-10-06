package exercise4;

import common.ListUtilsService;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "123", "grape", "elephant", "45", "cat");
        System.out.println("Original list: " + items);

        List<String> sortedByFirstCharacter = ListUtilsService.sortByFirstCharacter(items);
        System.out.println("Sorted by first Char: " + sortedByFirstCharacter);

        List<String> replacedA = ListUtilsService.replaceA(items);
        System.out.println("Replaced A: " + replacedA);

    }
}
