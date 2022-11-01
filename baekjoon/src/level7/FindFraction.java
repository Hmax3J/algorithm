package level7;

import java.util.Scanner;

public class FindFraction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int x = sc.nextInt(); sc.nextLine();
		int cross = 1;
		int crossSum = 0;
		
		if(!(1 <= x && x <= 10000000)) {
			System.out.println("범위에 맞는 값을 입력하세요.");
		} else {
			while(true) {
				if(x <= cross + crossSum) {
					if(cross % 2 == 1) {
						sb.append((cross - (x - crossSum - 1)) + "/" + (x - crossSum));
						break;
					} else {
						sb.append((x - crossSum) + "/" + (cross - (x - crossSum - 1)));
						break;
					}
				} else {
					crossSum += cross;
					cross++;
				}
			}
			System.out.println(sb);
		}
	}
}