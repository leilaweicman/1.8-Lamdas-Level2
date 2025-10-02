package common;

import java.util.List;

public class ListUtilsService {
    public static List<String> filterNamesStartingWithAAndLength3(List<String> names) {
        return names.stream()
                .filter(name -> name.startsWith("A"))
                .filter(name -> name.length() == 3)
                .toList();
    }
}
