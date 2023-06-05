import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] array = new int[N];
		for(int i=0; i<array.length; i++)
			array[i] = sc.nextInt();
		
		int cnt = 1;		// 오른쪽에서 보이는 갯수
		int maxHeight = array[array.length-1];	// 가장 높은 막대기의 높이
	
		for(int i=array.length-2; i>=0; i--) {
			if(array[i] > maxHeight) {
				cnt ++;
				maxHeight = array[i];
			}
		}
		System.out.println(cnt);
	}
}