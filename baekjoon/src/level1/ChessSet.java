package level1;

import java.util.Arrays;
import java.util.Scanner;

public class ChessSet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] chessPiece = sc.nextLine().split(" ");
		
		int[] pieceFound = Arrays.stream(chessPiece).mapToInt(Integer::parseInt).toArray();
		int king = pieceFound[0]; // 킹 1개
		int queen = pieceFound[1]; // 퀸 1개
		int rook = pieceFound[2]; // 룩 2개
		int bishop = pieceFound[3]; // 비숍 2개
		int knight = pieceFound[4]; // 나이트 2개
		int pawns = pieceFound[5]; // 폰 8개
		
		if(0 <= king && king <= 10) { 
			king = 1 - king; // 킹이 1개보다 적으면 양수 1개보다 많으면 음수
		} 
		
		if(0 <= queen && queen <= 10) {
			queen = 1 - queen;
		} 
		
		if(0 <= rook && rook <= 10) {
			rook = 2 - rook;
		} 
		
		if(0 <= bishop && bishop <= 10) {
			bishop = 2 - bishop;
		} 
		
		if(0 <= knight && knight <= 10) {
			knight = 2 - knight;
		} 
		
		if(0 <= pawns && pawns <= 10) {
			pawns = 8 - pawns;
		} 
		
		System.out.printf("%d %d %d %d %d %d", king, queen, rook, bishop, knight, pawns);
	}
}
