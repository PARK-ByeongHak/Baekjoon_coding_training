import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스 횟수
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            // 변환할 10진수
            int n = sc.nextInt();
            // 2진수로 변환
            String str = Integer.toBinaryString(n);
            // 배열에 각 숫자 삽입
            String[] restr = str.split("");
            // List를 사용하여 배열을 뒤집음
            List<String> list = Arrays.asList(restr);
            Collections.reverse(list);
            // 배열 내 문자가 "1" 인지 확인하여 출력
            for(int j=0; j<restr.length; j++) {
            	if(restr[j].equals("1")) {
            		System.out.print(j);
                    // 마지막 출력이 아닐 경우 공백 삽입
            		if(j+1!=restr.length) {
            			System.out.print(" ");
            		}
            	}
            }
            // 마지막 테스트 케이스가 아닐 경우 개행 삽입
            if(i+1!=N) {
            	System.out.println();
            }
        }
        
	}
}