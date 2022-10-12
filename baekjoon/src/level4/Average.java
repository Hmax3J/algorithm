package level4;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Average {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); sc.nextLine();
		double[] result = new double[n];
		double averageTotal = 0;
			
		if(!(1 <= n && n <= 1000)) {
			System.out.println("범위에 맞는 값을 입력하세요.");
		} else {
			String scores = sc.nextLine().trim();
			StringTokenizer scoresData = new StringTokenizer(scores);
			
			int b = Integer.parseInt(scoresData.nextToken()); // 처음 값을 초기화 한다.
			int max = b;
			
			result[0] = b;
			
			for(int i = 1; i < n; i++) { // 0번 배열을 위에서 이미 사용했기 때문에 1번부터 시작한다.
				int score = Integer.parseInt(scoresData.nextToken());
				
				if(max < score) {
					max = score; 
				}
				
				result[i] = score;
			}
			
			for(double average: result) {
				averageTotal += average / max * 100;
			}
			
			System.out.println(averageTotal / n);
		}
	}
}