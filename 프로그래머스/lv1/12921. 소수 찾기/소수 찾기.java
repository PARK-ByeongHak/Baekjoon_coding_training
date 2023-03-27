class Solution {
    public int solution(int n) {
         int answer = 0;
          
          int[] number = new int[n+1];
          
          for(int i=2; i<=n; i++) {                         //2부터 n까지의 수를 배열에 넣는다.
              number[i] = i;
          }
          
          for(int i=2; i<=n; i++) {                         //2부터 시작해서 그의 배수들을 0으로 만든다.
              if(number[i]==0) continue;
              
              for(int j= 2*i; j<=n; j += i) {               //후에 0이면 넘어가고 아니면 그의 배수들을 다시 0으로 만든다.
                  number[j] = 0;
              }
          }
          
          for(int i=0; i<number.length; i++) {              //배열에서 0이 아닌 것들의 개수를 세준다.
              if(number[i]!=0) {
                  answer++;
              }
          }
          
          return answer;
    }
}