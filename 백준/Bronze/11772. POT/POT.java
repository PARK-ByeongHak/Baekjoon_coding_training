import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int sum = 0;
        for(int i=0; i<n; i++) {
            int idx = sc.nextInt();
            int sub = idx/10;
            int sup = idx%10;
            sum += (int)Math.pow(sub, sup);
        }
        System.out.println(sum);
    }
}