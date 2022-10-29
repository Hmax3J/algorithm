package level6;

import java.util.Scanner;

public class CheckWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); sc.nextLine();
		int count = 0;
		
		if(!(0 < n && n <= 100)) {
			System.out.println("범위에 맞는 값을 입력하세요.");
		} else {
			for(int i = 0; i < n; i++) {
				String s = sc.nextLine().trim();
				
			}
		}
	}
}