import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        long ac , bc;
        
        if(a%c>0) {
        	ac = a/c+1;
        }else {
        	ac = a/c;
        }
        if(b%c>0) {
        	bc = b/c+1;
        }else {
        	bc = b/c;
        }
        System.out.println(ac*bc);
    }
}