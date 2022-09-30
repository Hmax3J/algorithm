package level2;

import java.util.Scanner;

public class OvenClock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String hourMinute = sc.nextLine().trim();
		
		String[] data = hourMinute.split(" "); 
		
		int a = Integer.parseInt(data[0]); 
		int b = Integer.parseInt(data[1]);	
		int c = sc.nextInt();
		
		int min = 60 * a + b + c;   // 시 -> 분
 
        int hour = (min / 60) % 24; // 시 (24시 이상이 될 경우 0시부터 시작하도록 한다)
        int minute = min % 60;
 
        System.out.println(hour + " " + minute);
		
		/* 내가 짠 코드.....
		int m1 = ((b + c) % 60);
		int m2 = ((b + c) / 60);
		int h = (a + m2);
		
		if((b + c) < 60) {
			System.out.println(a + " " + (b + c));
		} else {
			if(h >= 24) {
				if(m1 >= 60) {
					System.out.println(((h - 24) + m2) + " " + (m1 - 60));
				} else {
					System.out.println((h - 24) + " " + m1);
				}
			} else {
				if(m1 >= 60) {
					System.out.println((h + m2) + " " + (m1 - 60));
				} else {
					System.out.println(h + " " + m1);
				}
			}
		}
		*/
	}
}