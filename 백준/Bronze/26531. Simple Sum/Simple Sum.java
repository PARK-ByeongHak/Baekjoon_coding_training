import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] restr = str.split(" ");
        int a = Integer.parseInt(restr[0]);
        int b = Integer.parseInt(restr[2]);
        int c = Integer.parseInt(restr[4]);
        if(a+b==c) {
        	System.out.println("YES");
        }else {
        	System.out.println("NO");
        }
    }
}
