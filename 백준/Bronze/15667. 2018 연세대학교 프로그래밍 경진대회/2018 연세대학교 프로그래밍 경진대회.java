import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = Integer.parseInt(scan.nextLine().trim());
        
        System.out.println((int)Math.sqrt(input));
        scan.close();
    } 
}