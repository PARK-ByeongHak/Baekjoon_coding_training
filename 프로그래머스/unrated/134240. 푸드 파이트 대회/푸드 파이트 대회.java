class Solution {
    public static String solution(int[] food) {
    String answer = "";

    for(int i=1; i<food.length; i++){
        int count = food[i] / 2;
        for(int j=1; j<=count; j++){
            answer += String.valueOf(i);
        }
    }
    answer += "0";

    for(int i=answer.length()-2; i>=0; i--){
        answer += answer.charAt(i);
    }
    return answer;
    }
}

