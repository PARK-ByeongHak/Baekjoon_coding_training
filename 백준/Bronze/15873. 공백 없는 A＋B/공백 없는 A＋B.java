import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int num1 = 0, num2 = 0;
        String[] num = a.split("");
        			// num의 길이가 4일 때(입력 받은 숫자가 4자리 일 경우)
        if(num.length==4) {
        			// 들어오는 숫자는 최대 10 이므로 무조건 20임
        	System.out.println("20");
        			// num의 길이가 3일 때(입력 받은 숫자가 3자리 일 경우)
        }else if(num.length==3) {
        			// num[0]이 1이면 10+num[1]의 숫자를 출력
        	if(num[0].equals("1")&&num[1].equals("0")) {
        		System.out.println(10+Integer.parseInt(num[2]));
        			// num[1]이 1이면 10+num[0]의 숫자를 출력
        	}else {
        		System.out.println(10+Integer.parseInt(num[0]));
        	}
        			// 입력 받은 숫자가 2자리 일 경우(둘 다 1자릿수 일 경우)
        }else {
        	System.out.println(Integer.parseInt(num[0])+Integer.parseInt(num[1]));
        }
    }
}