package bronze.V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberCheck2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] numberIn = bf.readLine().split(" ");

        long[] numbers = new long[numberIn.length];

        if(numberIn.length != 5) {
            System.out.println("5자리의 고유번호를 입력하세요.");
            return;
        }

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = Long.parseLong(numberIn[i]);
        }

        long result = 0;

        for(long number : numbers) {
            if(number < 0 || 99999 < number) {
                System.out.println("입력 범위를 초과했습니다.");
                break;
            } else {
                result += number * number;
            }
        }

        System.out.println(result % 10);
    }
}