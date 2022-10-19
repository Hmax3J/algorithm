package level6;

import java.util.Scanner;

public class FindTheAlphabet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine().trim();
		int[] sData = new int[26];
		
		if(!(0 < s.length() && s.length() <= 100)) {
			System.out.println("길이가 100이하인 단어를 입력하세요.");
		} else {
			for(int i = 0; i < sData.length; i++) {
				sData[i] = -1;
			}
			
			for(int i = 0; i < s.length(); i++) {
				char sIndex = s.charAt(i);
				
				if(sData[sIndex - 'a'] == -1) {
					sData[sIndex - 'a'] = i;
				}
			}
			
			for(int result: sData) {
				System.out.print(result + " ");
			}
		}
	}
}