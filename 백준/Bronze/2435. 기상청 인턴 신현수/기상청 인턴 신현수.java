import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // N , K 값 입력
        int N = sc.nextInt();
        int K = sc.nextInt();

        // N일간 기온 기록
        int[] T = new int[N];

        for(int i = 0; i < N; i++){
            T[i] = sc.nextInt();
        }

        // K일간, 가장 큰 기온 합 찾기
        int top = -1000000000;
        int res = 0;
        int i = 0;
        
        // i 초기화 변수 초기화
        int temp = 0;
        
        // 더하는 횟수 기록 변수 초기화
        int temp2 = 0;

        for(int f = 0; f < N - K +1; f++){
            i = temp;
            while(temp2 != K){
                res += T[i];
                i++;
                temp2++;
            }
            if(res > top){
                top = res;
            }
            temp++;
            temp2 = 0;
            res = 0;
        }

        // 결과 출력
        System.out.println(top);

        sc.close();
    }
}