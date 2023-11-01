import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a=0,b=0;
        int num;
        for(int i=0;i<4;i++) {
            num = sc.nextInt();
            a+=num;
        }
        for(int i=0;i<4;i++) {
            num = sc.nextInt();
            b+=num;
        }
        if(a>b) {
        	System.out.println("Gunnar");
        }else if(a<b) {
        	System.out.println("Emma");
        }else {
        	System.out.println("Tie");
        }
    }
}