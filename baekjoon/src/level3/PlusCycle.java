package level3;

import java.util.Scanner;

public class PlusCycle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int copyN = n;
		int cycle = 0;
		
		if(!(0 <= n && n <= 99)) {
			System.out.println("범위에 맞는 값을 입력하세요.");
		} else {
			if(n < 10) {
				String zeroN = String.format("%02d", n); // 입력 값이 1자리 일 경우 입력 값 앞에 0을 채워 2자리로 만든다.
				String[] nData = zeroN.split("");
				
				int tenN = Integer.parseInt(nData[0]);
				int oneN = Integer.parseInt(nData[1]);
				while(true) {
					n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10); // 입력 값의 1의 자리가 새로운 수의 10의자리가 되고 입력 값의 10,1의 자리를 더한 값이 새로운 수의 1의자리가 된다.
					cycle++;
					
					if(copyN == n) { // 입력 값이 재귀 했을 때 반복문을 종료한다.
						break;
					}
				}
				System.out.println(cycle);
			} else {
				while(true) {
					n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
					cycle++;
					
					if(copyN == n) {
						break;
					}
				}
				System.out.println(cycle);
			}
		}
	}
}