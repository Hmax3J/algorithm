package level1;

import java.io.*;

public class LittleJeongMin {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] data = bf.readLine().split(" "); 
		
		long A = Long.parseLong(data[0]);
		long B = Long.parseLong(data[1]);
		long C = Long.parseLong(data[2]);
		
		long result = A + B + C; // 문제에서 입력 값을 잘 보자. int로 선언하면 런타임 에러가 난다.
		
		System.out.println(result);
	}
}