import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		//변수 선언
		int Num = sc.nextInt();
		double[] grade = new double[Num];
		double max=0, avg=0, sum=0;
		//점수 입력
		for (int i = 0; i < Num; i++) {
			grade[i] = sc.nextInt();
			//최대값 변경
			if (grade[i]>max) {
				max=grade[i];
			}
			//평균계산을 위해 값 저장
			sum+=grade[i];
		}
		//계산해서 출력
		System.out.println(sum*100.0/max/Num);
	}	
}