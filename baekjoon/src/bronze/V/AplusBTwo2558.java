package bronze.V;

import java.util.Scanner;

public class AplusBTwo2558 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a + b < 2 || 18 < a + b) {
            System.out.println("범위에 맞는 값을 입력하세요.");
        } else {
            System.out.println(a + b);
        }
    }
}