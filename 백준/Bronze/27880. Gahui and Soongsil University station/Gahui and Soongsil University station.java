import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int res = 0;
        
        for (int i = 0; i < 4; i++) {
            String[] input = scanner.nextLine().split(" ");
            String path = input[0];
            int height = Integer.parseInt(input[1]);
            
            if (path.equals("Stair")) {
                res += height * 17;
            } else {
                res += height * 21;
            }
        }
        
        System.out.println(res);
    }
}
