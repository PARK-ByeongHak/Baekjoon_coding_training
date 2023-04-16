import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int time1 = (11*60*24)+(11*60)+11;
        int time2 = (a*60*24)+(b*60)+c;
        
        int answer = time2-time1;
        if(answer<0) {
            System.out.println("-1");
        }else {
        	System.out.println(answer);
        }
    }
}