class Solution {
    public int[] solution(int n) {
        int[] num = new int[n];
        int cnt = 0;
        for(int i=1;i<=num.length;i++){
            if(n%i==0){
                num[cnt]=i;
                cnt++;
            }
        }
        int[] answer = new int[cnt];
        for(int i=0;i<answer.length;i++){
            answer[i] = num[i];
        }
        return answer;
    }
}