package coding_basic_training;

import java.math.BigInteger;

public class SumOfTwoNumbers {
    public String solution(String a, String b) {

        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);

        BigInteger answer = bigA.add(bigB);

        return answer.toString();
    }
}
