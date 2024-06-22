package coding_basic_training;

import java.util.ArrayList;
import java.util.List;

public class SliceList {
    List<Integer> list = new ArrayList<>();

    public int[] solution(int n, int[] slicer, int[] num_list) {
        return sliceArray(n, slicer, num_list);
    }

    private int[] sliceArray(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        List<Integer> sliceList = new ArrayList<>();

        if (n == 1) {
            sliceList = n1(b, num_list);
        } else if (n == 2) {
            sliceList = n2(a, num_list);
        } else if (n == 3) {
            sliceList = n3(a, b, num_list);
        } else {
            sliceList = n4(a, b, c, num_list);
        }

        return sliceList.stream().mapToInt(Integer::intValue).toArray();
    }

    private List<Integer> n1(int b, int[] num_list) {
        list.clear();
        for (int i = 0; i <= b; i++) {
            list.add(num_list[i]);
        }

        return list;
    }

    private List<Integer> n2(int a, int[] num_list) {
        list.clear();
        for (int i = a; i < num_list.length; i++) {
            list.add(num_list[i]);
        }

        return list;
    }

    private List<Integer> n3(int a, int b, int[] num_list) {
        list.clear();
        for (int i = a; i <= b; i++) {
            list.add(num_list[i]);
        }

        return list;
    }

    private List<Integer> n4(int a, int b, int c, int[] num_list) {
        list.clear();
        for (int i = a; i <= b; i += c) {
            list.add(num_list[i]);
        }

        return list;
    }
}
