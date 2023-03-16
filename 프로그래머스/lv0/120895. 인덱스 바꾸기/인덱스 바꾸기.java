import java.util.*;
 
class Solution {
    public String solution(String my_string, int num1, int num2) {
        
        List<String> list = new ArrayList<>(List.of(my_string.split("")));
        //list의 두 값을 교환
        Collections.swap(list, num1, num2);
        
        String answer = String.join("", list);
        
        return answer;
    }
}