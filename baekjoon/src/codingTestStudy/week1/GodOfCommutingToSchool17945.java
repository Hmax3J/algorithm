package codingTestStudy.week1;

import java.util.*;

public class GodOfCommutingToSchool17945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        int A = sc.nextInt();
        int B = sc.nextInt();

        for (int i = -1000; i <= 1000; i++) {
            for (int j = -1000; j <= 1000; j++) {
                if (i * j == B && i + j == -2 * A) {
                    set.add(i);
                    set.add(j);
                }
            }
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        if (list.size() == 1) {
            System.out.println(list.get(0));
        } else {
            System.out.println(list.get(0) + " " + list.get(1));
        }
    }
}
