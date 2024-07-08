package coding_LV1;

public class WalkInThePark {
    public int[] solution(String[] park, String[] routes) {
        int[] startRC = findStart(park);
        int row = startRC[0];
        int col = startRC[1];

        for (String route : routes) {
            String[] value = route.split(" ");
            int move = Integer.parseInt(value[1]);
            int newRow = row;
            int newCol = col;

            for (int j = 0; j < move; j++) {
                switch (value[0]) {
                    case "N" -> newRow--;
                    case "S" -> newRow++;
                    case "W" -> newCol--;
                    case "E" -> newCol++;
                }

                if (!isValid(park, newRow, newCol)) {
                    newRow = row;
                    newCol = col;
                    break;
                }
            }

            row = newRow;
            col = newCol;
        }

        return new int[] {row, col};
    }

    private int[] findStart(String[] park) {
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }

    private boolean isValid(String[] park, int row, int col) {
        int h = park.length;
        int w = park[0].length();

        return row >= 0 && row < h && col >= 0 && col < w && park[row].charAt(col) != 'X';
    }
}
