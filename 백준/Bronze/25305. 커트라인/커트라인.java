import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int student = sc.nextInt();
		int[] array = new int[student];
		int award = sc.nextInt();
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		System.out.println(array[student-award]);
	}
}