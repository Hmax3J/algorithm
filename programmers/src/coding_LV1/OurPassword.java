package coding_LV1;

public class OurPassword {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int count = 0;

            while (count < index) {
                ch++;

                if (ch > 'z') {
                    ch = 'a';
                }

                if (skip.indexOf(ch) == -1) {
                    count++;
                }
            }

            sb.append(ch);
        }

        return sb.toString();
    }
}
