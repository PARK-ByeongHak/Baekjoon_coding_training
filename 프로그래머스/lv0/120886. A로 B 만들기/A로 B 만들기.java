import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] beforeC = before.toCharArray();  //before값 배열에 삽입
        char[] afterC= after.toCharArray();     //after값 배열에 삽입
        
        Arrays.sort(beforeC);
        Arrays.sort(afterC);                    //정렬
        
        String beforeS = new String(beforeC);
        String afterS = new String(afterC);     //String으로 다시 삽입
        
        if(beforeS.equals(afterS)){
            answer = 1;                         //1 리턴(양쪽의 값이 같음)
        }else{
            answer = 0;                         //0 리턴(양쪽의 값이 같지 않음)
        }
        
        return answer;
    }
}