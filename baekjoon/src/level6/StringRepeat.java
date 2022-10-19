package level6;

import java.util.Scanner;

public class StringRepeat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int t = sc.nextInt(); sc.nextLine();
		
		if(!(0 < t && t <= 1000)) {
			System.out.println("올바른 범위의 값을 입력하세요.");
		} else {
			for(int i = 0; i < t; i++) {
				String s = sc.nextLine().trim();
				String[] rs = s.split(" ");
				int r = Integer.parseInt(rs[0]);
				
				if(!(1 <= r && r <= 8)) {
					System.out.println("올바른 범위의 값을 입력하세요.");
				} else {
					for(int y = 0; y < rs[1].length(); y++) {
						for(int j = 0; j < r; j++) {
							sb.append(rs[1].charAt(y));
						}
					}
					sb.append("\n");
				}
			}
			System.out.println(sb);
		}
	}
}