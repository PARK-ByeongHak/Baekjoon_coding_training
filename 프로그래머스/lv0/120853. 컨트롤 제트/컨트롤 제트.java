class Solution {
    public int solution(String s) {
        int answer = 0;
        s+=" 0";
        String[] array = s.split(" ");
        for(int i=0;i<array.length-1;i++){
            if(array[i+1].equals("Z")){
                array[i]="0";
                array[i+1]="0";
            }
            answer+=Integer.parseInt(array[i]);
        }
        return answer;
    }
}