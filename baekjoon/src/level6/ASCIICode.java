package level6;

import java.util.Scanner;

public class ASCIICode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n = sc.nextLine().trim();
		
		System.out.println((int)n.charAt(0));
	}
}