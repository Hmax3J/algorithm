package level6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CountWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine().trim();
		
		if(!(0 <= s.length() && s.length() <= 1000000)) {
			System.out.println("범위에 맞는 값을 입력하세요.");
		} else {
			StringTokenizer sData = new StringTokenizer(s);
			
			System.out.println(sData.countTokens());
		}
	}
}