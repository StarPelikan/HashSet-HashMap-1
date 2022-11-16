import java.util.*;

public class Main {
    static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
    public static <Letter> void main(String[] args) {
        char[] character = text.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char text : character) {
            if (!map.containsKey(text) && Character.isLetter(text)) {
                map.put(text, 1);
            } else {
                if (map.containsKey(text)) {
                    int i = map.get(text);
                    map.put(text, ++i);
                }
            }
        }
        System.out.println(map);
        Map.Entry<Character, Integer> maxEntry = null;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }
        Map.Entry<Character, Integer> minEntry = null;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (minEntry == null || entry.getValue() < minEntry.getValue()) {
                minEntry = entry;
            }
        }
        System.out.println("Больше всего встречается буква: " + maxEntry);
        System.out.println("Меньше всего встречается буква: " + minEntry);
    }

}


