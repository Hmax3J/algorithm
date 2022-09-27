package level2;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String score = sc.nextLine().trim();
		
		int num = 0;
		
		if(score.matches("[0-9]*")) {
			num = Integer.parseInt(score);
			String grade = "";
				
			if(!(0 <= num && num <= 100)) {
				System.out.println("0점 이상 100점 이하의 점수를 입력하세요.");
			} else {
				switch(num / 10) {
					case 9: case 10: grade = "A"; break;
					case 8: grade = "B"; break;
					case 7: grade = "C"; break;
					case 6: grade = "D"; break;
					default: grade = "F";
				}
			}
			
			System.out.println(grade);
		} else System.out.println("0점 이상 100점 이하의 점수를 입력하세요.");
	}
}