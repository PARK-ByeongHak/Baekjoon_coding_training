import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
        	String str = sc.nextLine(); // 문자열 입력받기(next() 를 쓰면 공백에서 끊김)
        	if(str.contentEquals("***")) { // *** 입력시 종료
        		break;
        	}
        	String[] restr = str.split(""); // 문자열 분리
        	for(int i=restr.length-1; i>=0;i--) {
        		System.out.print(restr[i]); // 역순으로 출력
        	}
        	System.out.println(); // 전부 출력 완료시 개행
        }
    }
}
