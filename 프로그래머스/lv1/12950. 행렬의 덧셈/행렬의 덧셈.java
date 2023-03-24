class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        for(int i=0 ; i<arr1.length ; i++) {
            for(int j=0 ; j<arr1[0].length ; j++) {         // 행렬 길이많큼 반복
                arr1[i][j] += arr2[i][j];                   // 같은 행, 같은 열의 arr2의 수를 arr1에 더함
            }
        }
        return arr1;
    }
}