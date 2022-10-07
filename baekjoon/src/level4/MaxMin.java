package level4;

import java.util.Scanner;
import java.util.StringTokenizer;

public class MaxMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt(); sc.nextLine();
		
		if(!(1 <= n && n <= 1000000)) {
			System.out.println("범위에 맞는 값을 입력하세요.");
		} else {
			String ab = sc.nextLine().trim();
			StringTokenizer abData = new StringTokenizer(ab);
			int max = 0;
			int min = 0;
				
			if(!(n == abData.countTokens())) {	
				System.out.println("n의 개수에 맞게 입력하세요.");
			} else {
				int b = Integer.parseInt(abData.nextToken()); // 처음 값을 초기화 한다.
				max = b; // 기준점이 될 값을 초기화 한다.
				min = b;
				
				for(int j = 0; j < n - 1; j++) { // 처음 값 초기화 할 때 nextToken을 해서 토큰 개수는 n - 1 이다.
					int a = Integer.parseInt(abData.nextToken()); // 다음 값을 받는다.
					
					if(max < a) { // 초기 값과 다음 값을 비교한다.
						max = a; 
					}
					
					if(min > a) {
						min = a;
					}
				}
				System.out.println(min + " " + max);
			}
		}
	}
}