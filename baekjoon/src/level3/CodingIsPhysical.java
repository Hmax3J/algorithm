package level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodingIsPhysical {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String date = bf.readLine().trim();
		
		int N = Integer.parseInt(date);
		
		StringBuilder sb = new StringBuilder();
		
		if(N % 4 == 0 && (4 <= N && N <= 1000)) {
			for(int i = 0; i < N / 4; i++) {
				sb.append("long ");
			}
			
			sb.append("int");
			System.out.println(sb);
		} else {
			System.out.println("4의 배수를 입력하세요.");
		}
	}
}