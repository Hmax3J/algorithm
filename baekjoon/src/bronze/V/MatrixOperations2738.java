package bronze.V;

import java.io.*;

public class MatrixOperations2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = bf.readLine().split(" ");

        int N = Integer.parseInt(nm[0]);
        int M = Integer.parseInt(nm[1]);

        int[][] A = new int[N][M];
        int[][] B = new int[N][M];

        if (!(N > 0 && M > 0 && N <= 100 && M <= 100)) {
            printMessage();
        } else {
            for(int i = 0; i < N; i++) {
                String[] mAData = bf.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    int checkValue = Integer.parseInt(mAData[j]);
                    if (Math.abs(checkValue) <= 100) {
                        A[i][j] = checkValue;
                    } else {
                        printMessage();
                        return;
                    }
                }
            }

            for (int i = 0; i < N; i++) {
                String[] mBData = bf.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    int checkValue = Integer.parseInt(mBData[j]);
                    if (Math.abs(checkValue) <= 100) {
                        B[i][j] = checkValue;
                    } else {
                        printMessage();
                        return;
                    }
                }
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    System.out.print(A[i][j] + B[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    private static void printMessage() {
        System.out.println("범위에 맞는 값을 입력하세요.");
    }
}