package level1;

import java.util.Scanner;

public class ArithmeticOperation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 입력 값을 받기 위해 스캐너 선언
		
		String a = sc.nextLine(); // 예제 입력이 한 줄로 받았기 때문에 Line으로 선언
		
		String[] data = a.split(" "); // 한 줄로 받은 데이터를 변수로 쓰기 위해 공백을 기준으로 나눈다.
		String aData = data[0]; 
		String bData = data[1];
		
		int A = Integer.parseInt(aData); // 사칙연산을 하기 위해 string 데이터를 int로 parsing 한다.
		int B = Integer.parseInt(bData);
		
		System.out.println(A + B);
		System.out.println(A - B);
		System.out.println(A * B);
		System.out.println(A / B);
		System.out.print(A % B);
	}
}