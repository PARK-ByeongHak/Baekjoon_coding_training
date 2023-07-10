import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // N , L 입력
        int N = sc.nextInt();
        int L = sc.nextInt();

        // L 문자로 변경
        char LC = (char) (L + '0');

        // 검사 시작
        int i = 1; // 기준값 변수 초기화
        int n = 0; // 학생 수 세는 변수 초기화
        int P = 0; // L이 있는 확인 변수 / 0이면 없음 1이면 있음
        
        // 전체 학생 수가 될 때까지 반복
        while(n != N) {
            String A = String.valueOf(i);
            char[] AC = A.toCharArray();

            for(int j = 0; j < A.length(); j++){
                if(AC[j] == LC){
                    P = 1;
                    break;
                }
            }

            if(P == 0) { // 만약 L이 없는 라벨이면 추가 가능
                n++;
                i++;
            }else {
                P = 0;
                i++;
            }
        }
        System.out.println(i-1); // 결과 출력
    }    
}