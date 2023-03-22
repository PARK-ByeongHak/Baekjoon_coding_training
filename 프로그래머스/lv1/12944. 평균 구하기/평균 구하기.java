class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int cnt = 0;
        for(int i=0; i<arr.length; i++) {
            answer+=arr[i];
            cnt++;
        }
        
        return answer/cnt;
    }
}