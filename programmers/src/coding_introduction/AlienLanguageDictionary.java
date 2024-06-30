package coding_introduction;

import java.util.Arrays;

public class AlienLanguageDictionary {
    public int solution(String[] spell, String[] dic) {
        StringBuilder sb = new StringBuilder();
        int answer = 2;

        Arrays.sort(spell);

        for (int i = 0; i < spell.length; i++) {
            sb.append(spell[i]);
        }

        String value = sb.toString();

        for (int i = 0; i < dic.length; i++) {
            char[] ch = dic[i].toCharArray();
            Arrays.sort(ch);
            String dicString = new String(ch);

            if (value.equals(dicString)) {
                answer = 1;
                break;
            }
        }

        return answer;
    }
}
