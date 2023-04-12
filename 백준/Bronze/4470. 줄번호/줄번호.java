import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();				//몇 줄 인쇄할지 정함
        sc.nextLine();						//줄바꿈도 인식하기 때문에 미리 제거함.
        
        for(int i=1; i<=x; i++) {
        	String str = sc.nextLine();
        	System.out.println(i+". "+str);	//현재 번호와 입력받은 문자를 출력함.
        }
    }
}