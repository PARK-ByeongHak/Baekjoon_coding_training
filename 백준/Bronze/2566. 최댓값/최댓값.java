import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] array = new int[9][9];
		int max =0;
		int col = 0, row = 0;
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				array[i][j] = sc.nextInt();
				if(max<=array[i][j]) {
					max = array[i][j];
					col = i+1;
					row = j+1;
				}
			}
		}
		System.out.println(max);
		System.out.println(col + " " + row);
	}
}