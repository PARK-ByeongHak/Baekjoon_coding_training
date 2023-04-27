import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine(); // 버퍼 지우기
        
        for (int i = 0; i < n; i++) {
            String inputLine = sc.nextLine();
            String[] numbers = inputLine.split(" ");
            
            boolean isMack = false;
            boolean isZack = false;
            for (String number : numbers) {
                if (number.equals("18")) {
                    isMack = true;
                } else if (number.equals("17")) {
                    isZack = true;
                }
            }
            
            System.out.println(inputLine);
            if (isMack && isZack) {
                System.out.println("both");
            } else if (isMack) {
                System.out.println("mack");
            } else if (isZack) {
                System.out.println("zack");
            } else {
                System.out.println("none");
            }
            System.out.println();
        }
    }
}
