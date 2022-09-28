package level2;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String leapYear = sc.nextLine().trim();
		
		int year = 0;
		
		if(leapYear.matches("[0-9]*")) { // 숫자만 입력 받았는지 유효성 검사
			year = Integer.parseInt(leapYear); // string을 int로 parsing 
				
			if(!(1 <= year && year <= 4000)) { // 유효성 검사
				System.out.println("올바른 연도를 입력하세요.");
			} else {
				if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) { // 윤년이면 실행한다.
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			}
		} else System.out.println("숫자를 입력하세요.");
	}
}