package codingTestStudy.week2;

import java.util.*;

public class YonseiUnivProgrammingContest14658 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;

        for (int tak = 1; tak <= n; tak++) {
            for (int young = 1; young <= n; young++) {
                for (int nam = 1; nam <= n; nam++) {
                    if (tak + young + nam != n) {
                        continue;
                    }

                    if (nam < young + 2) {
                        continue;
                    }

                    if (tak % 2 != 0) {
                        continue;
                    }

                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
