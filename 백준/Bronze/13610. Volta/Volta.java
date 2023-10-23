import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        int lab = 1;
        int cur = a;
        
        lab += (cur % (b - a) == 0) ? cur / (b - a) : cur / (b - a) + 1;
        
        System.out.println(lab);
    }
}
