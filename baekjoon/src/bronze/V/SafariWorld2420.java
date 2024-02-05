package bronze.V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SafariWorld2420 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] nm = bf.readLine().split(" ");
		
		Long N = Long.parseLong(nm[0]);
		Long M = Long.parseLong(nm[1]);
		
		if((-2_000_000_000 <= N && N <= 2_000_000_000) && (-2_000_000_000 <= M && M <= 2_000_000_000)) {
			Long result = Math.abs(N - M); // N - M 이 int형을 초과한다. 그래서 Long으로 선언한다.
			System.out.println(result);
		} else {
			System.out.println("범위에 맞는 값을 입력하세요.");
		}
	}
}