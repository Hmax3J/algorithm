package coding_basic_training;

public class DiceGame1 {
    public int solution(int a, int b) {
        return getScore(a, b);
    }

    boolean oddCheck(int a, int b) {
        if(a % 2 == 1 && b % 2 == 1) {
            return true;
        }

        return false;
    }

    boolean oneOddCheck(int a, int b) {
        if(a % 2 == 1 || b % 2 == 1) {
            return true;
        }

        return false;
    }

    int getScore(int a, int b) {
        int score = 0;

        if (oddCheck(a, b)) {
            score = (a * a) + (b * b); // pow는 double이라 직접 곱함.
        } else if (oneOddCheck(a, b)) {
            score = 2 * (a + b);
        } else {
            score = Math.abs(a - b);
        }

        return score;
    }
}
