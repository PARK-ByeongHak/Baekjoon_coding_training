import java.util.*;

class Solution {
    public int solution(String t, String p) {
        
        int cnt = t.length() - p.length() + 1;                      //반복 횟수 정의(전체 문자 길이 - 묶을 문자 길이 +1 회)
        String[] tgtArr = new String[cnt];
        int passCnt = 0;                                            //result 카운터
        
        for(int i=0; i<cnt; i++){                                   //반복문 작동
            tgtArr[i] = t.substring(i, p.length()+i);               //배열에 i부터 p의 자릿수+i 만큼 나눠서 삽입
            if(Long.parseLong(tgtArr[i]) <= Long.parseLong(p)) {
                passCnt++;                                          //비교하여 p의 값보다 작거나 같을 경우 카운터 증가
            }
        } 
        return passCnt;                                             //출력
    }
}