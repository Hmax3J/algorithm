package level6;

import java.util.Scanner;

public class Dial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine().trim();
		int count = 0;
		
		if(!(2 <= s.length() && s.length() <= 15)) {
			System.out.println("범위에 맞는 값을 입력하세요.");
		} else {
			for(int i = 0; i < s.length(); i++) {
				switch(s.charAt(i)) {
				case 'A': case 'B': case 'C': count += 3; break;
				case 'D': case 'E': case 'F': count += 4; break;
				case 'G': case 'H': case 'I': count += 5; break;
				case 'J': case 'K': case 'L': count += 6; break;
				case 'M': case 'N': case 'O': count += 7; break;
				case 'P': case 'Q': case 'R': case 'S': count += 8; break;
				case 'T': case 'U': case 'V': count += 9; break;
				case 'W': case 'X': case 'Y': case 'Z': count += 10;
				}
			}
			System.out.println(count);
		}
	}
}