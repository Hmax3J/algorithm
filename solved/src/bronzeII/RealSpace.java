package bronzeII;

import java.util.*;

public class RealSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        double[] inputs = new double[N];

        for (int i = 0; i < N; i++) {
            inputs[i] = scanner.nextInt();
        }

        int size = scanner.nextInt();
        long result = 0;

        for (int i = 0; i < inputs.length; i++) {
            if (inputs[i] == 0) {
                continue;
            }

            if (inputs[i] < size) {
                result += size;
            } else {
                long count = (long) (Math.ceil(inputs[i] / size));
                result += (count * size);
            }
        }

        System.out.println(result);
    }
}