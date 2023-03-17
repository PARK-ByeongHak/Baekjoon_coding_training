class Solution {
    public int solution(int order) {
        int answer = 0;
        String clap = ""+order;
        for(int i=0;i<clap.length();i++){
            char tempClap = clap.charAt(i);

            if (tempClap == '3' || tempClap == '6' || tempClap == '9') {
                answer++;
            }
        }
        return answer;
    }
}