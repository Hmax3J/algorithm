package level6;

import java.util.Scanner;

public class Constant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String s = sc.nextLine().trim();
		String[] ab = s.split(" ");
		int a = Integer.parseInt(ab[0]);
		int b = Integer.parseInt(ab[1]);
		
		a = (a / 100) + ((a % 100) / 10) * 10 + (a % 10) * 100;
		b = (b / 100) + ((b % 100) / 10) * 10 + (b % 10) * 100;
		
		if(a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}
}