import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++){
        	String str = sc.next();
        	String[] restr = str.split(",");
        	System.out.println(Integer.parseInt(restr[0])+Integer.parseInt(restr[1]));
        }
        
    }
}
