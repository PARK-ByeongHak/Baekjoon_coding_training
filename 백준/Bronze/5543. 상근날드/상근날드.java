import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int num1 = sc.nextInt();
    	int num2 = sc.nextInt();
    	int num3 = sc.nextInt();
    	int min1 = Math.min(num1, num2);
    	min1 = Math.min(min1, num3);
    	int num4 = sc.nextInt();
    	int num5 = sc.nextInt();
    	int min2 = Math.min(num4, num5);
    	System.out.println(min1+min2-50);
    }
}