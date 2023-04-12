import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x < y)
            System.out.println("-1");
        else{
            int a = (x+y)/2, b = (x-y)/2;
            if(a+b==x && a-b==y)
                System.out.println(a+" "+b);
            else
                System.out.println("-1");
        }
    }
}