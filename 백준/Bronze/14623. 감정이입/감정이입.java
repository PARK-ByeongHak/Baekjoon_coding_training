import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 2진표현을 포함한 바이트 배열을 BigInteger로 받기 위해 매개변수로 2를 넘겼다. 
        BigInteger a = scanner.nextBigInteger(2);
        BigInteger b = scanner.nextBigInteger(2);
        
        // multiply() 메소드는 BigInteger의 곱셈의 메소드
        BigInteger multiply = a.multiply(b);
        // toString() 메소드에 매개변수 2를 넘겨 두 자연수의 곱을 이진수로 변환
        String answer = multiply.toString(2);
        
        System.out.println(answer);


    }
}