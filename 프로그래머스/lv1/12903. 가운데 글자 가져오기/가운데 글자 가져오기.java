class Solution {
    public String solution(String s) {
        String answer = "";
        if(s.length() % 2 == 0){                //글자의 길이가 짝수일 때
            answer += s.charAt(s.length()/2-1);
            answer += s.charAt(s.length()/2);
        }
        else {                                  //글자의 길이가 홀수일 때
            answer += s.charAt(s.length()/2);
        }

        return answer;
    }
}