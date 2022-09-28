package level2;

import java.util.Scanner;

public class Quadrant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int result = 0;
		
		if(!(-1000 <= x && x <= 1000 && x != 0) && 
			(-1000 <= y && y <= 1000 && y != 0)) {
			System.out.println("-1000 이상 1000 이하의 정수를 입력하세요.");
		} else { // x, y 양수 1, x음수 y양수 2, x음수 y음수 3, x양수 y음수 4
			if(x > 0) {
				if(y > 0) result = 1;
				else result = 4;
			} else {
				if(y > 0) result = 2;
				else result = 3;
			}
			System.out.println(result);
			/*
			if(0 <= x && 0 <= y) result = 1;
			else if(x < 0 && 0 <= y) result = 4;
			else if(x < 0 && y < 0) result = 2;
			else result = 3;
			
			System.out.println(result);
			*/
		}
	}
}