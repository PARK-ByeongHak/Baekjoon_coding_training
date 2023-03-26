import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        String[] strArr = s.split("");
        Map<String, Integer> strMap = new HashMap<String, Integer>();
        int[] answer = new int[strArr.length];
        
        for(int i=0; i<strArr.length; i++){
            
            if(strMap.get(strArr[i]) == null){
                answer[i] = -1;
            }else {
                answer[i] = i - strMap.get(strArr[i]);
            }
            strMap.put(strArr[i], i);
        }
        
        return answer;
    }
}