package level7;

import java.util.Scanner;

public class BeeHouse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); sc.nextLine();
		int count = 1;
		int house = 2;
		
		if(!(1 <= n && n <= 1000000000)) {
			System.out.println("범위에 맞는 값을 입력하세요.");
		} else {
			if(n == 1) {
				System.out.println(1);
			} else {
				while(house <= n) {
					house += (6 * count);
					count++;
				}
				System.out.println(count);
			}
		}
	}
}