import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int KING = 1;
		int QUEEN = 1;
		int ROOK = 2;
		int BISHOP = 2;
		int KNIGHT = 2;
		int PAWN = 8;
 
		KING = KING - in.nextInt();
		QUEEN = QUEEN - in.nextInt();
		ROOK = ROOK - in.nextInt();
		BISHOP = BISHOP - in.nextInt();
		KNIGHT = KNIGHT - in.nextInt();
		PAWN = PAWN - in.nextInt();
 
		System.out.print(KING + " ");
		System.out.print(QUEEN + " ");
		System.out.print(ROOK + " ");
		System.out.print(BISHOP + " ");
		System.out.print(KNIGHT + " ");
		System.out.print(PAWN);		
		
	}
}