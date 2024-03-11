import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine()); //떡국 그릇의 개수
      
      int[] arr = new int[N]; //떡국 크기 입력 배열
      
      StringTokenizer st = new StringTokenizer(br.readLine());
      
      //떡국 크기 입력
      for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
      
      //오름차순 정렬
      Arrays.sort(arr);
      
      int result = 1;
      int count = 1;
      
      //앞에 것이 뒤에 것과 같으면 count를 1씩 증가하고, 중복되는 것이 결국 떡국 탑 개수
      for(int i=1;i<N;i++) {
    	  if(arr[i]==arr[i-1]) {
    		  count++;
    		  result = Math.max(result, count);
    	  }
    	  //앞에 것과 뒤가 다르면 count는 1로 초기화
    	  else count = 1;
      }
      
      System.out.println(result);
   }
}