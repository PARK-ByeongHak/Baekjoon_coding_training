import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long array[] = new Long[2];
		array[0] = sc.nextLong();
		array[1] = sc.nextLong();
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println((array[0] + array[1]) * (array[0] - array[1] + 1) / 2);
	}
}