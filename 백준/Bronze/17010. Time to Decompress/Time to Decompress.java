import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
       Scanner sc = new Scanner(System.in);
       
       int n = sc.nextInt();// 테스트 케이스 수
       for(int i=0; i<n; i++) {
    	   int cnt = sc.nextInt();//반복할 수
    	   char sym = sc.next().charAt(0);// 반복할 문자
    	   for(int j=0;j<cnt;j++)
    	   {
    		   System.out.print(sym);
    	   }
    	   System.out.println();
       }
    }
}