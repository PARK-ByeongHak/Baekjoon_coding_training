import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	// 태어난 연/월/일 과 계산기준 연/월/일 을 입력받음
        int y1 = sc.nextInt(), m1 = sc.nextInt(), d1 = sc.nextInt();
        int y2 = sc.nextInt(), m2 = sc.nextInt(), d2 = sc.nextInt();
        // 만나이
        int year1 = 0;
        
        if (m1 < m2) {
            year1 = y2 - y1;
        }else if (m1 == m2 && d1 <= d2) {
            year1 = y2 - y1;
        }else {
            year1 = y2 - y1 - 1;
        }
        // 세는 나이
        int year2 = y2 - y1 + 1;
        // 연 나이
        int year3 = y2 - y1;
    
        System.out.println(year1+"\n"+year2+"\n"+year3);
    }
}