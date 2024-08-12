package coding_LV1;

public class NumberPartner {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        int[] arrX = new int[10];
        int[] arrY = new int[10];

        for (char ch : X.toCharArray()) {
            arrX[ch - '0']++;
        }

        for (char ch : Y.toCharArray()) {
            arrY[ch - '0']++;
        }

        for (int i = arrX.length - 1; i >= 0; i--) {
            if (arrX[i] == arrY[i]) {
                if (arrX[i] != 0 && arrY[i] != 0) {
                    sb.append(String.valueOf(i).repeat(arrX[i]));
                }
            } else {
                if (arrX[i] != 0 && arrY[i] != 0) {
                    int min = Math.min(arrX[i], arrY[i]);
                    sb.append(String.valueOf(i).repeat(min));
                }
            }
        }

        if (sb.length() == 0) {
            sb.append("-1");
        } else {
            if (sb.charAt(0) == '0') {
                sb.setLength(0);
                sb.append("0");
            }
        }

        return sb.toString();
    }
}
