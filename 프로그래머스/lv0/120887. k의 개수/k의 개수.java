class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String strK = String.valueOf(k);
        for (int l = i; l <= j; l++) {
            String value = String.valueOf(l);
            if (value.contains(strK)) {
                String[] array = value.split("");
                for (String alpha : array) {
                    if (alpha.equals(strK)) answer++;
                }
            }
        }
        return answer;
    }
}