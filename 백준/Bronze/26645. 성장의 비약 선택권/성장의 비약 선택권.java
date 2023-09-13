import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        
        if(a<206) {
        	System.out.println("1");
        }else if(a>=206&&a<218){
        	System.out.println("2");
        }else if(a>=218&&a<229){
        	System.out.println("3");
        }else {
        	System.out.println("4");
        }
    }
}