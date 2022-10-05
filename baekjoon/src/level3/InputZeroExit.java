package level3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class InputZeroExit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String ab = sc.nextLine().trim();
			StringTokenizer abData = new StringTokenizer(ab);
			
			int a = Integer.parseInt(abData.nextToken());
			int b = Integer.parseInt(abData.nextToken());
			if(!((0 < a && a < 10) && (0 < b && b < 10))) {
				if(a == 0 && b == 0) { // 0이 포함되지 않기 때문에 0을 입력 했을 때 끝내려면 선언을 해주어야 한다.
					break;
				}
				System.out.println("올바른 값을 입력하세요.");
			} else {
				sb.append(a + b + "\n");
			}
		}
		System.out.print(sb);
	}
}