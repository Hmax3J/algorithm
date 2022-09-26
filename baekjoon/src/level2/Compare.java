package level2;

import java.util.Scanner;

public class Compare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		String compare = sc.nextLine(); 
		
		String[] data = compare.split(" "); 
		
		int A = Integer.parseInt(data[0]); 
		int B = Integer.parseInt(data[1]);
		
		System.out.println((A > B) ? ">" : (A < B ? "<" : "=="));
	}
}