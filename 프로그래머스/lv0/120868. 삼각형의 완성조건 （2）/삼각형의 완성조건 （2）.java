class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        for(int i=0;i<sides[0]+sides[1];i++){
            if(sides[0]<sides[1]+i&&sides[1]<i+sides[0]&&i<sides[0]+sides[1]){
                answer++;
            }
        }
        return answer;
    }
}