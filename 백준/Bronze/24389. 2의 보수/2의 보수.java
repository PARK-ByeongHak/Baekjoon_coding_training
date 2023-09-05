import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        // 입력
        int inputNum = Integer.parseInt(br.readLine());

        // 비트 반전 후 1 더하기
        int outputNum = ~inputNum + 1;

        // XOR 연산
        int sameBitNum = inputNum ^ outputNum;

        // 서로 다른 비트 수 카운트
        int count = 0;
        for (char ch : Integer.toBinaryString(sameBitNum).toCharArray()){
            if(ch == '1'){
                count++;
            }
        }

        // 출력
        System.out.print(count);

    }
}