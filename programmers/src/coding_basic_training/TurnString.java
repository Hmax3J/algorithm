package coding_basic_training;

import java.util.Scanner;

public class TurnString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < a.length(); i++) {
            if(i == a.length() - 1) {
                sb.append(a.charAt(i));
                continue;
            }
            sb.append(a.charAt(i) + "\n");
        }

        System.out.println(sb.toString());
    }
}
