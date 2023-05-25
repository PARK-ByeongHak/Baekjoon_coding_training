import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
       Scanner sc = new Scanner(System.in);

        BigInteger K = sc.nextBigInteger();
        int L = sc.nextInt();
        int N = 0;
        // K를 biginteger로 받아야 합니다.

        for (int i = 2; i < L; i++) {
            if(K.remainder(BigInteger.valueOf(i)).compareTo(BigInteger.ZERO)==0) {
            N = i;
            break;
            }
        }
        //L의 범위가 2부터 시작이라서 for문을 2부터 시작하도록 만들고 K와 i를 비교한 나머지가 0인지 아닌지를 판별합니다.
        //BigInteger와 int형 연산 주의
        String s = (N>0) ? ("BAD " + N) : "GOOD";
        System.out.println(s);
    }
}