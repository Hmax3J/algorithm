package coding_LV2;

public class CreatingJadenCaseString {
    public String solution(String s) {
        StringBuilder result = new StringBuilder();
        boolean isFirst = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                result.append(c);
                isFirst = true;
            } else {
                if (isFirst) {
                    result.append(Character.toUpperCase(c));
                } else {
                    result.append(Character.toLowerCase(c));
                }
                isFirst = false;
            }
        }

        return result.toString();
    }
}
