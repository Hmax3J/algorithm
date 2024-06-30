package coding_introduction;

import java.util.*;

public class MorseCode1 {
    public String solution(String letter) {
        Map<String, Character> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        String[] morse = {
                ".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..",
                "--","-.","---",".--.","--.-",".-.",
                "...","-","..-","...-",".--","-..-",
                "-.--","--.."
        };

        String[] morseArray = letter.split(" ");

        char morseValue = 'a';

        for (String morseKey : morse) {
            map.put(morseKey, morseValue++);
        }

        for (String morseString : morseArray) {
            sb.append(map.get(morseString));
        }

        return sb.toString();
    }
}
