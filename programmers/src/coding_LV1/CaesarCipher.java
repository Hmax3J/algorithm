package coding_LV1;

public class CaesarCipher {
    public String solution(String s, int n) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char val : arr) {

            if ('a' <= val && val <= 'z') {
                sb.append((char) ((val - 'a' + n) % 26 + 'a'));
            } else if ('A' <= val && val <= 'Z') {
                sb.append((char) ((val - 'A' + n) % 26 + 'A'));
            } else {
                sb.append(val);
            }

        }

        return sb.toString();
    }
}
