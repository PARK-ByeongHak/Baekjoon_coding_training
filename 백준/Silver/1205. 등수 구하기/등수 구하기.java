import java.util.*;

public class Main {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int new_score = sc.nextInt();
        int p = sc.nextInt();  //랭킹 리스트에 오를 수 있는 갯수.

        Integer[] arr = new Integer[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());

        if(n == p && new_score <= arr[arr.length-1]) {
            System.out.print(-1);
        }else {
            int rank = 1;
            for(int i=0; i<arr.length; i++){
                if(new_score < arr[i]) {
                    rank++;
                }else {
                    break;
                }
            }
            System.out.print(rank);
        }
    }
}