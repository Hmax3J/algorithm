package level3;

import java.util.Scanner;

public class Star2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		StringBuilder star = new StringBuilder();
		
		if(!(1 <= n && n <= 100)) {
			System.out.println("범위에 맞는 값을 입력하세요.");
		} else {
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= n - i; j++) { // 공백을 주는 for문이다. 공백은 입력 값 - 행 개수 이다.
					star.append(" ");
				}
				for(int j = 1; j <= i; j++) {
					star.append("*"); 
				}
				star.append("\n");
			}
			System.out.print(star);
		}
	}
}