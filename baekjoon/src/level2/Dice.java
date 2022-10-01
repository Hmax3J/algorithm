package level2;

import java.util.Scanner;

public class Dice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String dice = sc.nextLine().trim();

		String[] data = dice.split(" "); 

		int one = Integer.parseInt(data[0]); 
		int two = Integer.parseInt(data[1]);
		int three = Integer.parseInt(data[2]);
		int diceTotal = one + two + three;
		int max = 0;
		
		if(!(3 <= diceTotal && diceTotal <= 18)) {
			System.out.println("올바른 값을 입력하세요.");
		} else {
			if(one == two && one == three) { // 주사위 3개의 값이 같을 경우
				System.out.println(10000 + (one * 1000));
			} else if(one == two || one == three) { // 1, 2 또는 1, 3 주사위가 같을 경우
				System.out.println(1000 + (one * 100));
			} else if(two == three) { // 2, 3 주사위가 같을 경우
					System.out.println(1000 + (two * 100));
			} else { // 3개 전부 다를 경우
				max = one;
				if(two > max) max = two;
				if(three > max) max = three;
				System.out.println(max * 100);
			}
		}
	}
}