import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] array = new int[3];
		
		array[0] = sc.nextInt();
		array[1] = sc.nextInt();
		array[2] = sc.nextInt();
		
		Arrays.parallelSort(array);

		int num1 = array[1]-array[0];
		int num2 = array[2]-array[1];
		
		if(num1==num2) {
			System.out.println(array[2]+num1);
		}else if(num1<num2) {
			System.out.println(array[1]+num1);
		}else {
			System.out.println(array[0]+num2);
		}
	}
}