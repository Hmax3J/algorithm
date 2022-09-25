package level1;

import java.util.Scanner;

public class Remainder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String ABC = sc.nextLine();
		
		String[] data = ABC.split(" "); 
		
		int A = Integer.parseInt(data[0]); 
		int B = Integer.parseInt(data[1]);
		int C = Integer.parseInt(data[2]);
		
		System.out.println((A + B) % C);
		System.out.println(((A % C) + (B % C)) % C);
		System.out.println((A * B) % C);
		System.out.println(((A % C) * (B % C)) % C);
	}
}