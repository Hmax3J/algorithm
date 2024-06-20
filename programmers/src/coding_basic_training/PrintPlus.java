package coding_basic_training;

import java.util.Scanner;

public class PrintPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = a + b;

        System.out.println(a + " + " + b + " = " + result);
    }
}
