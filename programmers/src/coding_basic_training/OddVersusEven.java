package coding_basic_training;

public class OddVersusEven {
    public int solution(int[] num_list) {
        int numListLength = num_list.length;
        int sumOddNumber = num_list[0];
        int sumEvenNumber = 0;

        for(int i = 1; i < numListLength; i++) {
            if (i % 2 == 0) { // 인덱스는 0부터 시작이라 짝수 번호가 홀수 위치다.
                sumOddNumber += num_list[i];
            } else {
                sumEvenNumber += num_list[i];
            }
        }

        return sumOddNumber >= sumEvenNumber ? sumOddNumber : sumEvenNumber;
    }
}
