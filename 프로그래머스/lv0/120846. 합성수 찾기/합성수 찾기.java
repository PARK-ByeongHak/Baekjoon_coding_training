class Solution {
    public int solution(int n) {
        int answer = 0;
                                                
        for(int i = 1; i <= n; i++) {           //1부터 n까지의 자연수 중 합성수의 개수를 구하기 위한 반복문
            int count = 0;                      //약수의 개수 count, 각 수마다 count 초기화
            for(int j = 1; j<= i; j++) {
                count += (i % j == 0) ? 1 : 0;  //나누어 떨어지면 약수이기 때문에 count +1
            }
            answer += (count >= 3) ? 1 : 0;     //약수의 개수가 세 개 이상이면 합성수이기 때문에 answer +1
        }
        return answer;                          //합성수의 개수 return
    }
}