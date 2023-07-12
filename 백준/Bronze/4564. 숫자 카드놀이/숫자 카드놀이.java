import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
    	
        while (true) {
            String str = sc.next();
            if(str.equals("0")) break;
             
            while(true) {
                if(str.length() == 1) {
                    System.out.print(str);  
                    break;
                }
                System.out.print(str + " ");
                String[] arr = str.split("");
                int mul = 1;
                for (int i = 0; i < arr.length; i++) {
                    mul *= Integer.parseInt(arr[i]);
                }
                str = mul+"";
            }
            System.out.println();
        }
         
        sc.close();
    }
}