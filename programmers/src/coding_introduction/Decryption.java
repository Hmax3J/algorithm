package coding_introduction;

public class Decryption {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();

        for (int i = code; i <= cipher.length(); i += code) {
            char ch = cipher.charAt(i - 1);
            sb.append(ch);
        }

        return sb.toString();
    }
}
