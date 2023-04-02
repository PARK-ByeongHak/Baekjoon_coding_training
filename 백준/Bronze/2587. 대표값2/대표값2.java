import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int[] array = new int[5];
		int mid=0, avg=0;
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			avg+=array[i];
		}
		Arrays.sort(array);
		mid=array[2];
		System.out.println(avg/5);
		System.out.println(mid);
	}
}