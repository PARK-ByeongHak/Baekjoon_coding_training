import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int k=sc.nextInt();
        int c=sc.nextInt();
        for(int i=0;i<c;i++){
            int m=sc.nextInt();
            int n=sc.nextInt();
            if(m<n){
                if(n-m-1>=k-n+1) {
                    System.out.println("0");
                }else {
                    System.out.println("1");
                }
            }else if(m>n) {
                if(m-n-1>k-m+1) {
                    System.out.println("0");
                }else {
                    System.out.println("1");
                }
            }else {
                System.out.println("1");
            }
        }
    }
}