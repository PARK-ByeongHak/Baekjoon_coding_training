import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        
        for ( int i = 0; i < T; i++ ){
            int hailstone = sc.nextInt();
            
            int max = 0;
            
            max = hailstone;
            
            while( hailstone != 1 ){
                if ( max <= hailstone ){
                    max = hailstone;
                }
                
                if ( hailstone % 2 == 0 ){
                    hailstone = hailstone/2;
                }
                else if ( hailstone % 2 != 0 && hailstone != 1 ){
                    hailstone = hailstone*3 + 1;
                }
            }
            
            System.out.println(max);
            
        }
    }
 
}