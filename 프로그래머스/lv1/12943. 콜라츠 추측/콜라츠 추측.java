class Solution {
    public int solution(long num) {
        int answer = 0;
        for(int i=1; i<=500; i++){
            if(num==1){
                i+=500;
            }
            if(num%2==0){
                num=num/2;
                if(num==1){
                    answer=i;
                i+=500;
                }
            }else{
                num=num*3+1;
                if(num==1){
                    answer=i;
                i+=500;
                }
            }
            if(i==500&&num!=1){
                answer= -1;
                i+=500;
            }
        }
                return answer;
    }
}