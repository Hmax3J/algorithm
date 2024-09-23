package coding_LV2;

public class MagicElevator {
    public int solution(int storey) {
        int answer = 0;

        while (storey > 0) {
            int lastDigit = storey % 10;
            int nextDigit = (storey / 10) % 10;

            if (lastDigit < 5) {
                answer += lastDigit;
            }

            else if (lastDigit > 5) {
                answer += (10 - lastDigit);
                storey += 10;
            }

            else {
                if (nextDigit >= 5) {
                    storey += 10;
                }
                answer += 5;
            }

            storey /= 10;
        }

        return answer;
    }
}
