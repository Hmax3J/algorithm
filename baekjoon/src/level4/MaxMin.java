package level4;

import java.util.Scanner;
import java.util.StringTokenizer;

public class MaxMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		
		if(!(1 <= n && n <= 1000000)) {
			System.out.println("범위에 맞는 값을 입력하세요.");
		} else {
			String ab = sc.nextLine().trim();
			StringTokenizer abData = new StringTokenizer(ab);
			
			int a = Integer.parseInt(abData.nextToken());
			int b = Integer.parseInt(abData.nextToken());
			
			
		}
	}
}