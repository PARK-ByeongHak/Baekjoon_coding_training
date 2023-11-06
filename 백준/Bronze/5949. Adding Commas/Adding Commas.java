import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        DecimalFormat df = new DecimalFormat("#,###"); // 출력 방식 설정
        String formattedNumber = df.format(N);
        
        System.out.println(formattedNumber);
    }
}
