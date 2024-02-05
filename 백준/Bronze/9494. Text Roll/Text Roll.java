import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
            sc.nextLine();
			
			String[] input = new String[n];
			for(int i = 0; i < input.length; i++) {
				input[i] = sc.nextLine();
			}
			
			Problem9494 problem = new Problem9494(n, input);
			problem.solve();
		}
		
		sc.close();
	}
}

class Problem9494 {
	private int row;
	private String[] input;
	
	private int curRow;
	private int curCol;
	
	public Problem9494(int row, String[] input) {
		this.row = row;
		this.input = input;
		curRow = 0;
		curCol = 0;
	}
	
	public void solve() {
		char[][] charArray = new char[row][];
		
		for(int i = 0; i < input.length; i++) {
			charArray[i] = input[i].toCharArray();
		}
		
		while(curRow < row) {
			while(curCol < charArray[curRow].length && charArray[curRow][curCol] != ' ') curCol++;
			curRow++;
		}
		
		System.out.println(curCol+1);
	}
}