import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        
        String replace = "";
		replace = my_string.toLowerCase().replaceAll("[^\\d]", "");
        String[] arry = replace.split("");
        Arrays.sort(arry);
        int[] answer = new int[arry.length];
        for(int i = 0; i< arry.length; i++) {
                answer[i] = Integer.parseInt(arry[i]);
            }
        return answer;
    }
}