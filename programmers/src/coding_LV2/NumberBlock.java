package coding_LV2;

import java.util.*;

public class NumberBlock {
    public int[] solution(long begin, long end) {
        int size = (int) (end - begin + 1);
        int[] result = new int[size];

        for (long i = begin; i <= end; i++) {
            result[(int) (i - begin)] = getBlockNumber(i);
        }

        return result;
    }

    private int getBlockNumber(long position) {
        if (position == 1) {
            return 0;
        }

        int largestDivisor = 1;

        for (long divisor = 1; divisor <= Math.sqrt(position); divisor++) {
            if (position % divisor == 0) {
                long pairedDivisor = position / divisor;

                if (divisor < position && divisor <= 10_000_000) {
                    largestDivisor = Math.max(largestDivisor, (int) divisor);
                }

                if (pairedDivisor < position && pairedDivisor <= 10_000_000) {
                    largestDivisor = Math.max(largestDivisor, (int) pairedDivisor);
                }
            }
        }

        return largestDivisor;
    }
}
