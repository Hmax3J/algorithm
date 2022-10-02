package level3;

import java.util.Scanner;

public class Receipt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(); sc.nextLine();
		int n = sc.nextInt(); sc.nextLine();
		int[] total = new int[n];
		int addTotal = 0;
		
		for(int i = 0; i < n; i++) {
			String ab = sc.nextLine().trim();
			
			String[] receipt = ab.split(" "); 
			
			int a = Integer.parseInt(receipt[0]);
			int b = Integer.parseInt(receipt[1]);
			
			total[i] = a * b;
			
			// 배열 선언 없이 계산 하는 방법
			// x = x - (a * b); // x값이 0이 된다면 같은 값을 뺏기 때문에 x와 영수증 값이 같다고 생각하면 된다. 
		}
		
		for(int result: total) { // 배열 없이 하면 for가 필요없다.
			addTotal += result;
		}
		
		if(addTotal == x) { // 배열 없이 하면 조건은 x == 0 이 된다.
			System.out.print("Yes");
		} else {
			System.out.print("No");
		}
	}
}