class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 1;
        int cnt=1;
        while(true){
            
            if(cnt>=k){
                break;
            }else{
                answer+=2;
                if(answer>numbers[numbers.length-1]){
                    answer-=numbers[numbers.length-1];
                }
                cnt++;
            }
        }
        return answer;
    }
}