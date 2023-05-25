import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
       Scanner sc = new Scanner(System.in);
       
       int n = sc.nextInt();// 글자 수
       sc.nextLine();// 개행 비우기
       String str = sc.nextLine();// 글자
       String[] restr = str.split("");// 글자 배열에 나눠넣기
       
       System.out.println(restr[n-5]+restr[n-4]+restr[n-3]+restr[n-2]+restr[n-1]);
    }
}