package coding_basic_training;

import java.util.Scanner;

public class PrintWithCaseChanged {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder();

        for (char ch : a.toCharArray()) {
            if ('A' <= ch && ch <= 'Z') {
                sb.append((char) (ch + 32));
            } else if ('a' <= ch && ch <= 'z') {
                sb.append((char) (ch - 32));
            }
        }

        System.out.println(sb.toString());
    }
}
