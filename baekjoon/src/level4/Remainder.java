package level4;

import java.util.Scanner;

public class Remainder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] result = new int[10];
		int count = 0;
		
		for(int i = 0; i < 10; i++) {
			int a = sc.nextInt(); sc.nextLine();
			
			if(!(0 <= a && a <= 1000)) {
				System.out.println("올바른 값을 입력하세요.");
			} else {
				result[i] = a % 42;
				
				
				System.out.println(count);
			}
		}
	}
}