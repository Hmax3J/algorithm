package level3;

import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		StringBuilder star = new StringBuilder();
		
		if(!(1 <= n && n <= 100)) {
			System.out.println("범위에 맞는 값을 입력하세요.");
		} else {
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= i; j++) {
					star.append("*"); // +연산과 println을 계속 호출 하면 성능이 떨어진다. stringbuilder의 append로 한 번에 해결한다.
				}
				star.append("\n");
			}
			System.out.println(star);
		}
	}
}