class Solution {
    public int[] solution(int[] numbers, String direction) {
        
		int[] answer = new int[numbers.length];
        
		for (int i = 0; i < answer.length; i++) {
            // 왼쪽 오른쪽 판별
			if (direction.equals("left")) {
                //입력을 위해 while 작성
				while(i < numbers.length - 1) {
					answer[i] = numbers[i + 1];
					i++;
				}
				answer[numbers.length - 1] = numbers[0];
			}
            // 왼쪽 오른쪽 판별
			if (direction.equals("right")) {
                //입력을 위해 while 작성
				while(i < numbers.length - 1) {
					answer[0] = numbers[numbers.length - 1];
					answer[i + 1] = numbers[i];
					i++;
				}
			}
		}
        
        return answer;
    }
}