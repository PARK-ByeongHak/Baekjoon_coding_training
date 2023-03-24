class Solution {
    public int solution(int[] numbers) {
        int answer = 45;                //0~9 까지 모두 더한 수
        for (int n : numbers) {         //반복문 실행
            answer -= n;                //겹치는 숫자만큼 빼기로 제거
        }

        return answer;                  //남는 숫자의 합
    }
}