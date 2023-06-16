import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, left=1,left_max,right_max, right=1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int []a= new int [n];
        
        for(int i=0; i<n;i++){
            a[i] = sc.nextInt();
        }

        left_max=a[0];
        right_max=a[n-1];

        for(int i=1; i<n;i++){
            if(left_max<a[i]){
                left_max=a[i];
                left ++;
            }
        }


        for(int i=n-2; i>=0;i--){
            if(a[i]>right_max){
                right_max = a[i];
                right++;
            }
        }

        System.out.println(left);
        System.out.println(right);
    

    }
    
}