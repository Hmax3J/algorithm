package level4;

import java.util.Scanner;

public class MaxResult {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int count = 0;
		int[] nData = new int[9];
		int n = 0;
			 
		if(n > 100) {
			System.out.println("100이하의 자연수를 입력하세요.");
		} else {
			for(int j = 0; j < 9; j++) {
				n = sc.nextInt(); sc.nextLine();
				nData[j] = n;
				 
				if(max < nData[j]) {
					max = nData[j];
					count = j + 1;
				}
			}
		}
		System.out.println(max);
		System.out.println(count);
	}
}