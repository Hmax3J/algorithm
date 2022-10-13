package level4;

import java.util.Scanner;
import java.util.StringTokenizer;

public class AverageOver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			String scores = sc.nextLine().trim();
			StringTokenizer scoresData = new StringTokenizer(scores);
			
			int b = Integer.parseInt(scoresData.nextToken());
			int[] arr = new int[b];
			double total = 0;
			
			for(int j = 0; j < b; j++) {
				int score = Integer.parseInt(scoresData.nextToken());
				arr[j] = score;
				total += score; 
			}	
				
			double average = total / b;
			double averageOver = 0;
			
			for(int j = 0; j < b; j++) {
				if(arr[j] > average) {
					averageOver++;
				}
			}
			System.out.printf("%.3f%%\n", (averageOver / b) * 100);
		}
	}
}