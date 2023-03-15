class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arry = my_string.toCharArray();
		
		// a ~ z 97 ~122
		// A ~ Z 65~90
		
		String temp ="";
		//char 배열로 만들어서 하나씩 꺼내고 (ASCII 코드 사용) 대소문자 변환하기.
		for(int i = 0; i<arry.length; i++) {
			if( arry[i] >= 97 && arry[i] <= 122 ) {
				temp = arry[i] + "";
				answer += temp.toUpperCase();//a ~ z 인지 확인 후 변환
			} else if( arry[i] >=65 && arry[i] <= 90){
				temp = arry[i] + "";
				answer += temp.toLowerCase();//A ~ Z 인지 확인 후 변환
			}
		}
        return answer;
    }
}