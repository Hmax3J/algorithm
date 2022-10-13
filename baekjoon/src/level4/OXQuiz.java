package level4;

import java.util.Scanner;

public class OXQuiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt(); sc.nextLine();
		
		String arr[] = new String[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextLine().trim();
		}
		
		for (int i = 0; i < n; i++) {
			int cnt = 0;	// 연속횟수
			int sum = 0;	// 누적 합산
			
			for (int j = 0; j < arr[i].length(); j++) {
				if (arr[i].charAt(j) == 'O') {
					cnt++;
				} else {
					cnt = 0;
				}
				sum += cnt;
			}
			sb.append(sum).append('\n');
		}
		System.out.println(sb);
	}
}