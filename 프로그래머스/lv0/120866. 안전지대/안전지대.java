class Solution {
    public int solution(int[][] board) {
        int[][] boomBoard = new int[board.length][board[0].length];                                 //boomboard 범위 설정
        for (int i = 0; i < board.length; i++) {                                                    //반복문 실행
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) checkExplosion(i, j, boomBoard);                              //checkExplosion 호출
            }
        }

        int count = 0;
        for (int[] array : boomBoard) {                         //boomboard를 이용하여 안전지대 검사 for문 실행
            for (int value : array) {
                if (value == 0) count++;                        //받아온 boomboard를 기준으로 값이 0(안전지대) 일 경우 count를 1 증가 시킴
            }
        }
        return count;
    }

    static void checkExplosion(int x, int y, int[][] boomBoard) {                                   //board[i][j]값을 받아옴
        int explosionX;
        int explosionY;                                                                             //변수 선언
        int[] aroundX = {0, -1, -1, -1, 0, 0, 1, 1, 1};
        int[] aroundY = {0, -1, 0, 1, -1, 1, -1, 0, 1};                                             //폭발테이블 선언
        for (int i = 0; i < 9; i++) {
            explosionX = x + aroundX[i];
            explosionY = y + aroundY[i];
            if (explosionX < boomBoard.length && explosionY < boomBoard.length)
                if (explosionX >= 0 && explosionY >= 0) boomBoard[explosionX][explosionY] = 1;      //조건 확인 후 값 반환
        }
    }
}