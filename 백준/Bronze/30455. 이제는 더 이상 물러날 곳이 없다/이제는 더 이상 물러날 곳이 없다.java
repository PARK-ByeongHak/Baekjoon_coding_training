import java.util.Scanner;

public class Main{
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n%2==0) System.out.println("Duck");
        else System.out.println("Goose");
        scan.close();
    } 
}