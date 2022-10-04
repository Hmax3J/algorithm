package level3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class NumberLessThanX {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nx = sc.nextLine().trim(); // 수열 A를 이룰 정수의 갯수 N과 작은 값의 기준이 될 X를 선언한다.
		StringTokenizer nxData = new StringTokenizer(nx); // 문자열을 띄어쓰기 기준으로 쪼갠다.
		
		int n = Integer.parseInt(nxData.nextToken());
		int x = Integer.parseInt(nxData.nextToken());
		
		StringBuilder sb = new StringBuilder(); // println 출력 횟수를 줄이기 위해 stringbuilder에 한 번에 모으기 위해 선언한다.
		
		if(!((1 <= n && n <= 10000) && (1 <= x && x <= 10000))) {
			System.out.println("범위에 맞는 값을 입력하세요.");
		} else {
			String sequenceA = sc.nextLine().trim(); // 수열 A를 선언한다.
			StringTokenizer aData = new StringTokenizer(sequenceA); // 수열 A를 띄어쓰기 기준으로 쪼갠다.
			
			int countToken = aData.countTokens();
			
			for(int i = 0; i < countToken; i++) {
				int aToken = Integer.parseInt(aData.nextToken()); // 수열 A의 값들을 int로 변환한다.
				if(aToken < x) { // 수열 A의 값이 x 보다 작을 경우 A의 값을 저장한다.
					sb.append(aToken + " ");
				}
			}
			System.out.println(sb); // 저장된 값을 출력한다.
		}
	}
}