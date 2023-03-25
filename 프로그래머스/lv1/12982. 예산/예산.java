import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);                         //가장 적은 양 부터 채워야 최대한의 부서에 지원이 가능하므로 오름차순으로 정렬
        for (int i = 0; i < d.length; i++) {    //반복문선언
        budget -= d[i];                         //budget에서 값을 차감(물품을 지급)
        if (budget < 0) break;                  //budget이 0보다 작으면 멈춤
        answer++;                               //위의 조건문이 발동하지 않을 경우 1추가(부서 하나에 지원이 완료)
    }
    return answer;                              //최대로 지원한 부서 수 리턴
    }
}