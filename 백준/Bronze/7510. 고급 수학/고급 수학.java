import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       int n=sc.nextInt();

       int[] array = new int[3];
       for(int i=0;i<n;i++) {
    	   array[0] = sc.nextInt();
    	   array[1] = sc.nextInt();
    	   array[2] = sc.nextInt();
           
    	   Arrays.sort(array);
           if(array[0]*array[0]+array[1]*array[1]==array[2]*array[2]) {
        	   System.out.println("Scenario #"+(i+1)+":");
        	   System.out.println("yes");
           }else {
        	   System.out.println("Scenario #"+(i+1)+":");
        	   System.out.println("no");
           }
           System.out.println();
       }
       
    }
}