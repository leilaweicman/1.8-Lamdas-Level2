package common;

import java.util.List;
import java.util.stream.Collectors;

public class ListUtilsService {
    public static List<String> filterNamesStartingWithAAndLength3(List<String> names) {
        return names.stream()
                .filter(name -> name.startsWith("A"))
                .filter(name -> name.length() == 3)
                .toList();
    }

    public static String formatNumbers(List<Integer> numbers) {
        return numbers.stream()
                .map(number -> (isEven(number) ? "e" : "o") + number)
                .collect(Collectors.joining(", "));
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
