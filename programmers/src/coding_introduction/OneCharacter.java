package coding_introduction;

public class OneCharacter {
    public String solution(String s) {
        int[] countArr = new int[26];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            countArr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < countArr.length; i++) {
            if (countArr[i] == 1) {
                sb.append((char) (i + 'a'));
            }
        }

        return sb.length() == 0 ? "" : sb.toString();
    }
}
