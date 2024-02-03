package bronze.V;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class LongCalculation2338 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		BigInteger a = new BigInteger(bf.readLine().trim());
		BigInteger b = new BigInteger(bf.readLine().trim());
		
		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		System.out.print(a.multiply(b));
	}
}