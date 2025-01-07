package bronzeII;

import java.util.*;

public class Resistor {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        String[] colors = {"black", "brown", "red", "orange", "yellow",
                            "green", "blue", "violet", "grey", "white"};

        for (int i = 0; i < 10; i++) {
            map.put(colors[i], i);
        }

        String rsOne = scanner.nextLine();
        String rsTwo = scanner.nextLine();
        String zeroCount = scanner.nextLine();

        long value = map.get(rsOne) * 10L + map.get(rsTwo);

        long multiplier = (long) Math.pow(10, map.get(zeroCount));
        long result = value * multiplier;

        System.out.println(result);
    }
}
