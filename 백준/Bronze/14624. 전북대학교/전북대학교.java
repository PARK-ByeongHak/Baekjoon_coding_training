import java.util.*;
import java.io.*;
 
class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
       
        // 짝수 일 경우
        if(n%2==0) {
            System.out.println("I LOVE CBNU");
        }
        // 홀수 일 경우
        else {
            for(int j=0;j<n;j++) {
                System.out.print("*");
            }
            n=n/2+1;
            int first_count =n;
            int last_count =n;
             
             System.out.print("\n");
            for(int i=0;i<n;i++) {
                for(int j=0;j<first_count;j++) {
                    System.out.print(j!=first_count-1?" ":"*");
                    }
                
                for(int j=first_count;j<last_count;j++) {
                    System.out.print(j!=last_count-1?" ":"*");
                    }
            System.out.print("\n");
            first_count-=1;last_count+=1;
        }    
    }
}
}