import java.util.*;
 
public class Main {
 
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int K = sc.nextInt();
 
        for ( int i = 0; i < K; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if ( A == X) {
                X = B;
            }
            else if ( B == X){
                X = A;
            }
        }
        System.out.println(X);
     }
}