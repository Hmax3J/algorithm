package coding_LV1;

public class MakingHamburgers {
    public int solution(int[] ingredient) {
        int[] array = new int[ingredient.length];
        int count = 0;
        int index = 0;

        for (int val : ingredient) {
            array[index] = val;
            index++;

            if (index >= 4 &&
                    array[index - 4] == 1 &&
                    array[index - 3] == 2 &&
                    array[index - 2] == 3 &&
                    array[index - 1] == 1) {

                count++;
                index -= 4;
            }
        }

        return count;
    }
}
