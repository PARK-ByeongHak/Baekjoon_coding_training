class Solution {
    public static String cal(int n,int len){
        String str="";
        
        while(n != 0){
            str = n%2 + str;                    // 1-1. 이진수 변환.
            n/=2;
        }
        
        while(str.length() != len){             // 1-2. n 자릿수 채우기.
            str = "0"+str;
        }
        
        return str;
    }
    
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n]; 
        
        for(int i =0;i<n;i++){
            String str_x,str_y,str="";                      // 2-1. 변환한 이진수 저장 변수 및 논리연산 결과 저장 변수.
            // 2-2. 각 배열에서 정수 저장.
            int x = arr1[i];
            int y = arr2[i];
            // 2-3. 이진수로 변환 및 자릿수 채우기.
            str_x = cal(x,n);
            str_y = cal(y,n);
            for(int j = 0;j<n;j++){                         // 2-4. 조건에 맞게 문자열 포맷 변경.
                if(str_x.charAt(j) == '1' || str_y.charAt(j) == '1') str+="#";
                else str+=" ";
            }
            answer[i] = str;                                // 2-5. 한 줄 완성.
        }
        return answer;
    }
}