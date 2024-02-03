package bronze.V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class VeryRich2 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] nm = bf.readLine().split(" ");
	
		BigInteger n = new BigInteger(nm[0]);
		BigInteger m = new BigInteger(nm[1]);
		BigInteger max = new BigInteger("10").pow(1000);
		
		if((0 <= n.compareTo(BigInteger.ONE) && n.compareTo(max) <= 0) || 
				(0 <= m.compareTo(BigInteger.ONE) && m.compareTo(max) <= 0)) {
			
			BigInteger qResult = n.divide(m);
			BigInteger mResult = n.mod(m);
			
			System.out.print(qResult + "\n" + mResult);
			
		} else {
			System.out.println("범위에 맞는 값을 입력하세요.");
		}
	}
}