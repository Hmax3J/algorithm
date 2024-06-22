package coding_basic_training;

import java.util.Scanner;

public class PrintStringRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            sb.append(str);
        }

        System.out.println(sb.toString());
    }
}
