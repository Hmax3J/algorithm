package coding_introduction;

public class AgeOfExoplanets {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();

        while (age > 0) {
            char c = (char) ('a' + age % 10);
            sb.insert(0, c);
            age /= 10;
        }

        return sb.toString();
    }
}
