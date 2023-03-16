class Solution {
    public int[] solution(int n, int[] numlist) {
        //배열, 카운터 선언
        int[] array = new int[numlist.length];
        int count = 0;
        //반복문 작동(numlist[i]번째 원소와 n의 나머지가 0일때(배수일때) array[count(지금은0)에 값을 넣고 count++])
        for(int i = 0; i<numlist.length; i++){
            if( numlist[i]%n == 0){
                array[count] = numlist[i];
                count++;
            }
        }
        //정답배열 선언
        int[] answer = new int[count];
        //count만큼 반복문 작동하여 정답 입력
        for(int i = 0; i<count; i++){
            answer[i] = array[i];
        }
        //출력
        return answer;
    }
}