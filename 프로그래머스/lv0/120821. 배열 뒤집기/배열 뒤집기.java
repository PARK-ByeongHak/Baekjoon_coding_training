class Solution {
    public int[] solution(int[] num_list) {
        //선언
        int[] answer = new int[num_list.length];
        //반복문 선언 후 앞 배열부터 맨뒤 숫자 삽입
        for(int i = 0;i<num_list.length;i++){
            answer[i]=num_list[num_list.length-i-1];
        }
        //출력
        return answer;
    }
}