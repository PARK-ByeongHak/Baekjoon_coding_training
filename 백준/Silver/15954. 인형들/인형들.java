import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken()); 
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n]; // 인형을 선호하는 사람의 수를 저장할 배열
        double variance = 0, tmp = 0, average = 0, stdDeviation = 0; // 분산,평균,표준편차
        double min = 10000000; 
 
        st = new StringTokenizer(br.readLine()); 
        for (int i = 0; i < n; i++) { 
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i <= n - k; i++) {
            int count = k; // k개 이상이기때문에 k개부터 하나씩 늘려가면서 표준편차가 최소일 때를 찾아야 함
            while (i + count <= n) { // 배열의 끝까지 연속할 경우를 확인해야하므로 i+count가 n보다 작거나 같을때까지만 반복
                tmp = average = variance = stdDeviation = 0; //
                for (int j = 0; j < count; j++) {
                    tmp += arr[i + j]; 
                }
                average = tmp / count; // 평균 구하기
                tmp = 0;
                for (int j = 0; j < count; j++) { // 분산구하기
                    tmp += (arr[i + j] - average) * (arr[i + j] - average); 
                }
                variance = tmp / count; // 분산 구하기
                stdDeviation = Math.sqrt(variance); // 표준 편차 구하는 함수
                min = Math.min(min, stdDeviation); 
                count++;
            }
        }
        System.out.println(String.format("%.12f", min));
    }
}