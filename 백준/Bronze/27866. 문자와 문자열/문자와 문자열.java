import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		//변수 선언
		String text = sc.nextLine();
		int num = sc.nextInt();
		
		String answer = text.substring(num-1, num);
		//출력
		System.out.println(answer);
	}	
}