import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] tree = new int[N];
		
		int min = 0;
		int max = 0;
		
		for(int i = 0; i < N; i++) {
			tree[i] = sc.nextInt();
			
			/*
			 * 나무들 중 최댓값을 구하기 위해 매 입력 때마다 max 변수와 비교하여
			 * 입력 받은 나무가 max보다 클 경우 max 값을 해당 나무의 높이로 갱신해준다. 
			 */
			if(max < tree[i]) {
				max = tree[i];
			}
		}
		
		// 이분 탐색 (upper bound)
		while(min < max) {
			
			int mid = (min + max) / 2;
			long sum = 0;
			for(int treeHeight : tree) {
				if(treeHeight - mid > 0) { 
					sum += (treeHeight - mid);
				}
			}
			if(sum < M) {
				max = mid;
			}else {
				min = mid + 1;
			}
		}
		
		System.out.println(min - 1);
		
	}
}