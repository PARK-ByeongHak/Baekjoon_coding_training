class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0;
        int matched = 0;                                                // 변수 초기화
        
        for (int l : lottos) {                                          // 로또만큼 반복
            if (l == 0) zero++;                                         // l이 0이면(가려져서 보이지 않으면) zero 증가 
            else {
                for (int w : win_nums) {                                // 0이 아닐 경우 당첨번호 수 만큼 반복
                    if (l == w) {
                        matched++;                                      // l이 win_nums의 값과 같으면 matched 증가 후 break;
                        break;
                    }
                }
            }
        }
        
        int min = matched;                                              // 최소로 맞춘 개수
        int max = matched + zero;                                       // 가려진 번호 포함 최대로 맞춘 개수
        
        int[] answer = {Math.min(7 - max, 6), Math.min(7 - min, 6)};    // 등수 계산 후 출력
        return answer;
    }
}