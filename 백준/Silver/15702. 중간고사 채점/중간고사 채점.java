import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
 
public class Main {
  public static void main(String args[]) throws Exception {
    BufferedReader reader = getReader();
     
    StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
     
    int N = Integer.parseInt(tokenizer.nextToken());
    int M = Integer.parseInt(tokenizer.nextToken());
     
    tokenizer = new StringTokenizer(reader.readLine());
     
    int point[] = new int[N];
    for(int i = 0; i<N; i++) {
      point[i] = Integer.parseInt(tokenizer.nextToken());
    }
    int sum[] = new int[100001];
    for(int i = 0; i<sum.length; i++) {
      sum[i] = Integer.MIN_VALUE;
    }
    int max = 0;
     
    for(int i = 0; i<M; i++) {
      tokenizer = new StringTokenizer(reader.readLine());
      int tmpSum = 0;
      int pos = Integer.parseInt(tokenizer.nextToken());
      for(int j = 0; j<N; j++) {
        if(tokenizer.nextToken().equalsIgnoreCase("O")) {
          tmpSum += point[j];
        }
      }
      sum[pos] = tmpSum;
      max = Integer.max(max, tmpSum);
    }
     
    for(int i = 1; i<=100000; i++) {
      if(max == sum[i]) {
        System.out.println(i+" "+max);
        return;
      }
    }
  }
  public static BufferedReader getReader() {
    return new BufferedReader(new InputStreamReader(System.in));
  }
}