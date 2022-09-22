package level1;

import java.util.Scanner;

public class ConvertYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int y = sc.nextInt(); // 불기를 입력받는다.
		
		System.out.println(y - 543); // 서기는 불기에서 543년을 뺀 값이다.
	}
}