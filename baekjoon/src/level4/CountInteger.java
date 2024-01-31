package level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CountInteger {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine().trim());
		
		int v = 0;
		
		int[] number = new int[n];
		
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		
		int findNumber = Integer.parseInt(bf.readLine());
		
		for(int i = 0; i < n; i++) {
			number[i] = Integer.parseInt(st.nextToken());
			if(number[i] == findNumber) {
				v++;
			}
		}
		
		System.out.println(v);
	}
}