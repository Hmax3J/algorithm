package level6;

import java.util.Scanner;

public class CheckWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); sc.nextLine();
		int count = n;
		
		if(!(0 < n && n <= 100)) {
			System.out.println("범위에 맞는 값을 입력하세요.");
		} else {
			for(int i = 0; i < n; i++) {
				boolean[] arr = new boolean[26];
				String s = sc.nextLine().trim();
				arr[(int)s.charAt(0) - 97] = true;
				for (int j = 1; j < s.length(); j++) {
					char c = s.charAt(j);
					if (c == s.charAt(j - 1)) continue;
					
					if (arr[(int)c - 97]) {
	                    count--;
	                    break;
	                }
	                arr[(int)c - 97] = true;
				}
			}
			System.out.println(count);
		}
	}
}