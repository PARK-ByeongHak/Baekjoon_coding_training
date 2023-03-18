class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int n = 7;
        String check ="";
    // 매개변수를 문자열 하나로 만들어 준다
        for (int i = 0; i < array.length; i++) {
            check += array[i];
        }
	// 문자열을 한 글자씩 일어서 변수 n과 비교 한다.
        for (int i = 0; i < check.length(); i++) {
            if(n == Integer.parseInt(String.valueOf(check.charAt(i))))
            answer++;
        }
        
        return answer;
    }
}