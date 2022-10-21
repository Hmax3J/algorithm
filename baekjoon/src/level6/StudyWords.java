package level6;

import java.util.Scanner;

public class StudyWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine().trim();
		int[] sData = new int[26];
		int max = 0;
		char ch = '?';
		
		if(!(0 < s.length() && s.length() <= 1000000)) {
			System.out.println("범위에 맞는 값을 입력하세요.");
		} else {
			for(int i = 0; i < s.length(); i++) {
				if('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
					sData[s.charAt(i) - 'A']++;
				} else {
					sData[s.charAt(i) - 'a']++;
				}
			}
	 
			for (int i = 0; i < 26; i++) {
				if (sData[i] > max) {
					max = sData[i];
					ch = (char) (i + 'A');
				}
				else if (sData[i] == max) {
					ch = '?';
				}
			}
	 
			System.out.print(ch);
		}
	}
}