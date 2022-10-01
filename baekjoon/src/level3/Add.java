package level3;

import java.util.Scanner;

public class Add {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		if(!(1 <= n && n <= 10000)) {
			System.out.println("범위에 맞는 값을 입력하세요.");
		} else {
			for(int i = 1; i <= n; i++) {
				sum += i;
			}
			System.out.println(sum);
		}
	}
}