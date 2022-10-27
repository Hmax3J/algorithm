package level6;

import java.util.Scanner;

public class CroatiaAlphabet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine().trim();
		String[] alphabet = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		if(!(0 < s.length() && s.length() <= 100)) {
			System.out.println("범위에 맞는 값을 입력하세요.");
		} else {
			for(int i = 0; i < alphabet.length; i++) {
				if(s.contains(alphabet[i])) {
					s = s.replace(alphabet[i], "$");
				}
			}
			
			System.out.println(s.length());
		}
	}
}