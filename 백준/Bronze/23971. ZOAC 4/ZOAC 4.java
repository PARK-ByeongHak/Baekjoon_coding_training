import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        int f = (a-1)/(c+1)+1; 
		int s = (b-1)/(d+1)+1;
		
		System.out.println(f*s);
    }
}