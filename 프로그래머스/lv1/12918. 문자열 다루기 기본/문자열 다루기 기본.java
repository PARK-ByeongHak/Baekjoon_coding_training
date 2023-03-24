class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        final String REGEX = "[0-9]+";
        if(s.length()==4||s.length()==6){
            if(s.matches(REGEX)){
        answer = true;
            }
        }
        return answer;
    }
}