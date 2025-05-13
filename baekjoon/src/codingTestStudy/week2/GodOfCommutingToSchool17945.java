package codingTestStudy.week2;

import java.util.*;

public class GodOfCommutingToSchool17945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        Set<Integer> roots = new HashSet<>();

        for (int i = -1000; i <= 1000; i++) {
            int val = i * i + 2 * A * i + B;
            if (val == 0) {
                roots.add(i);
            }
        }

        List<Integer> list = new ArrayList<>(roots);
        Collections.sort(list);

        if (list.size() == 1) {
            System.out.println(list.get(0));
        } else {
            System.out.println(list.get(0) + " " + list.get(1));
        }
    }
}
