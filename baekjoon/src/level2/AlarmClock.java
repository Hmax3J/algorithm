package level2;

import java.util.Scanner;

public class AlarmClock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String hourMinute = sc.nextLine().trim();
		
		String[] data = hourMinute.split(" "); 
		
		int h = Integer.parseInt(data[0]); 
		int m = Integer.parseInt(data[1]); // -45 하면 먼저 45분을 빼고 계산한다.
			
		if(!((0 <= h && h <= 23) && (0 <= m && m <= 59))) { // 유효성 검사 45분을 먼저 빼고 계산하면 -45 <= m <= 14 가 된다.
			System.out.println("올바른 시간을 입력하세요.");
		} else {
			if(h == 0) {
				if(m - 45 < 0) {
					h = 23;
					m += 15;
				} else {
					m -= 45;
				}
			} else {
				if(m - 45 < 0) {
					h -= 1;
					m += 15;
				} else {
					m -= 45;
				}
			}
			
//			if(m < 0) m += 60; // 먼저 45분을 빼고 계산한다.
//			
//			if(h == 0) {
//				if(m > 45) {
//					h = 23;
//				}
//			} else {
//				if(m > 45) {
//					h -= 1;
//				}
//			}
			
//			if(m >= 45) {
//				System.out.println(h + " " + (m - 45));
//			}
//			
//			else {
//				if(h == 0) {
//					h = 24;
//				}
//				
//				System.out.println(h-1 + " " + (m+15));
//			}
			
			System.out.println(h + " " + m);
		}
	}
}
