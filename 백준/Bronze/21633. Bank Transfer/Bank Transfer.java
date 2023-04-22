import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        double tax = 25+k*0.01;
        if(tax<100) {
        	tax=100;
        }
        if(tax>2000) {
        	tax=2000;
        }
        System.out.printf("%.2f",tax);
    }
}
