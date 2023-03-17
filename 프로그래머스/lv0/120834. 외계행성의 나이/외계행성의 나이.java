class Solution {
    public String solution(int age) {
        String answer = "";
        String nai = Integer.toString(age);
        for(int i=0;i<nai.length();i++){
            answer+=(char) ((char) nai.charAt(i)+49);
        }
        return answer;
    }
}