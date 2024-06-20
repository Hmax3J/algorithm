package coding_basic_training;

public class ReadingPortrait {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        char[][] array = new char[my_string.length() / m][m];
        int idx = 0;

        for(int i = 0; i < my_string.length() / m; i++) {
            if (m == 1) {
                return my_string;
            }

            for(int j = 0; j < m; j++) {
                array[i][j] = my_string.charAt(idx++);
            }
            sb.append(array[i][c - 1]);
        }

        /** 다른 사람 풀이 벽이 느껴진다 ㅠㅠ
        for (int i = c - 1; i < my_string.length(); i += m) {
            sb.append(my_string.charAt(i));
        }
         */

        return sb.toString();
    }
}
