package level3;

import java.util.Scanner;

public class AplusB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tcCount = sc.nextInt(); sc.nextLine();
		int[] total = new int[tcCount];	
		
		for(int i = 0; i < tcCount; i++) {
			String ta = sc.nextLine().trim();
			
			String[] taValues = ta.split(" "); 
			
			int a = Integer.parseInt(taValues[0]);
			int b = Integer.parseInt(taValues[1]);

			total[i] = a + b;
		}
		
		for(int result: total) {
			System.out.println(result);
		}
	}
}