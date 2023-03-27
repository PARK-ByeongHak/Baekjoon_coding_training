class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        //숫자를 담을 배열 선언
        int[] x = {0,0,0,0,0,0,0,0,0,0};
        int[] y = {0,0,0,0,0,0,0,0,0,0};
        
        //반복문을 이용해 배열에 숫자 삽입
        for(int i=0; i<X.length();i++){
           x[X.charAt(i)-48] += 1;                      
        }
        for(int i=0; i<Y.length();i++){
           y[Y.charAt(i)-48] += 1;
        }

        for(int i=9; i >= 0; i--){
            for(int j=0; j<Math.min(x[i],y[i]); j++){
                answer.append(i);
            }
        }
        
        if("".equals(answer.toString())){               //일치하는 숫자가 없을 경우
            return "-1";
        }else if(answer.toString().charAt(0)==48){      //일치하는 숫자가 0으로만 이루어져 있을 경우
            return "0";
        }else {                                         //그 외
            return answer.toString();
        }
    }
}