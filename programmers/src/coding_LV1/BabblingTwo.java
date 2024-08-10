package coding_LV1;

public class BabblingTwo {
    public int solution(String[] babbling) {
        String[] validPronunciations = {"aya", "ye", "woo", "ma"};
        int answer = 0;

        for (String word : babbling) {
            if (isValidPronunciation(word, validPronunciations)) {
                answer++;
            }
        }

        return answer;
    }

    private boolean isValidPronunciation(String word, String[] validPronunciations) {
        String temp = word;
        String prev = ""; // 이전 발음

        while (!temp.isEmpty()) {
            boolean found = false;

            for (String pronunciation : validPronunciations) {
                // 현재 문자열이 발음 가능한 문자열로 시작하고 이전 발음과 같지 않으면
                if (temp.startsWith(pronunciation) && !pronunciation.equals(prev)) {
                    temp = temp.substring(pronunciation.length()); // 발음 가능한 부분 문자열 제거
                    prev = pronunciation;
                    found = true;
                    break; // 더 이상의 발음 확인을 막기 위해 루프 종료
                }
            }

            // 발음 가능한 문자열이 없거나 연속 발음이 발견되면 잘못된 발음
            if (!found || prev.equals(temp)) {
                return false;
            }
        }

        return true;
    }
}
