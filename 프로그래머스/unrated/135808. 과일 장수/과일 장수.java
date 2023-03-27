import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;                                 //기본값 0(이익이 없을 경우)

        Arrays.sort(score);                             //품질 기준으로 정렬

        for(int i = score.length; i >= m; i -= m){      //가장 뒤쪽 배열(높은 품질) 부터 반복문을 시작하여 answer에 계산값 추가
            answer += score[i - m] * m;
        }

        return answer;
    }
}