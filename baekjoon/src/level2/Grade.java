package level2;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		String result = score >= 90 ? "A" : score >= 80 ? "B" : 
						score >= 70 ? "C" : score >= 60 ? "D" : "F";
		
		if(0 <= score && score <= 100) {
			System.out.println(result);
		} else System.out.println("0점 이상 100점 이하의 점수를 입력하세요.");
	}
}