package level6;

import java.util.Scanner;

public class BreakEvenPoint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String scores = sc.nextLine().trim();
		String[] bep = scores.split(" ");
		
		int a = Integer.parseInt(bep[0]);
		int b = Integer.parseInt(bep[1]);
		int c = Integer.parseInt(bep[2]);
		
		// n * c > a + (n * b) , n = a / c - b
		if (c <= b) {
			System.out.println("-1");
		} 
		else {
			System.out.println((a / (c - b)) + 1); // n * c 보다 커야 하니 값이 같아 질 때 + 1 을 한다.
		}
	}
}