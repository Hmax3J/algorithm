package coding_LV2;

import java.util.*;

public class CheckYourDistance {
    private boolean checkRoom(String[] place) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (place[i].charAt(j) == 'P') {
                    if (!isValid(place, i, j)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    private boolean isValid(String[] room, int r, int c) {
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int[][] diagonals = {{-1, -1}, {-1, 1}, {1, -1}, {1, 1}};
        int[][] twoSteps = {{-2, 0}, {2, 0}, {0, -2}, {0, 2}};

        for (int[] d : directions) {
            int nr = r + d[0];
            int nc = c + d[1];

            if (isInBounds(nr, nc) && room[nr].charAt(nc) == 'P') {
                return false;
            }
        }

        for (int[] d : diagonals) {
            int nr = r + d[0];
            int nc = c + d[1];

            if (isInBounds(nr, nc) && room[nr].charAt(nc) == 'P') {
                if (room[r].charAt(nc) != 'X' || room[nr].charAt(c) != 'X') {
                    return false;
                }
            }
        }

        for (int[] d : twoSteps) {
            int nr = r + d[0];
            int nc = c + d[1];

            if (isInBounds(nr, nc) && room[nr].charAt(nc) == 'P') {
                if (room[(r + nr) / 2].charAt((c + nc) / 2) != 'X') {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isInBounds(int x, int y) {
        return x >= 0 && x < 5 && y >= 0 && y < 5;
    }

    public int[] solution(String[][] places) {
        int[] answer = new int[5];

        for (int i = 0; i < 5; i++) {
            if (checkRoom(places[i])) {
                answer[i] = 1;
            } else {
                answer[i] = 0;
            }
        }

        return answer;
    }
}
