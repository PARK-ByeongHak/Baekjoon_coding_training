class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int i=a;
        int j=b;
        if(a<b){
            do{
                answer+=i;
                i++;
            }while(i<=b);
        }else {
            do{
            answer+=j;
            j++;
            }while(j<=a);
        }
        return answer;
    }
}