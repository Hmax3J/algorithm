package level6;

import java.util.Scanner;

public class SumOfNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); sc.nextLine(); // 반복할 개수를 입력한다.
		String[] num = sc.nextLine().split(""); // 입력한 문자열을 하나씩 쪼갠다.
		int sum = 0; // 합계에 쓸 변수 초기화
		
		if(n == num.length) { // n과 num의 크기가 같을 경우 조건문을 실행한다.
			for(int i = 0; i < n; i++) { // 하나씩 쪼갠 값을 각각 더하기 위해 for문을 쓴다.
				sum += Integer.parseInt(num[i]); // num이 String 이고 값을 더하기 위해서 int로 변환한다.
			}
		}
		
		System.out.println(sum);
	}
}