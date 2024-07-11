package coding_LV1;

public class ApplyMorePaint {
    public int solution(int n, int m, int[] section) {
        int count = 1;
        int start = section[0];
        int end = section[0] + (m - 1);

        for (int i : section) {
            if (start <= i && i <= end) {
                continue;
            } else {
                start = i;
                end = start + (m - 1);
                count++;
            }
        }

        return count;
    }
    /*
    public int solution(int n, int m, int[] section) {
        int maxPainted = 0, cntPaint = 0;
        for (int point : section) {
            if (maxPainted <= point) {
                maxPainted = point + m;
                cntPaint++;
            }
        }
        return cntPaint;
    }
     */
}
