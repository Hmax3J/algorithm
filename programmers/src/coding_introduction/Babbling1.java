package coding_introduction;

public class Babbling1 {
    public int solution(String[] babbling) {
        String[] value = {"aya", "ye", "woo", "ma"};
        int answer = 0;

        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < value.length; j++) {
                babbling[i] = babbling[i].replaceFirst(value[j], "-");
            }

            if (babbling[i].replaceAll("-", "").isEmpty()) {
                answer++;
            }
        }


        return answer;
    }
}
