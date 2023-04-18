import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        // 입력이 3개만 들어옴
		int[] n = new int[3];
        // 숫자를 입력 받음
		for(int i=0; i<3; i++) {
			n[i] = sc.nextInt();
		}
        // 정렬함(작은 수 부터)
		Arrays.sort(n);
        // 뒤에서 2번째 숫자 출력(두번째로 큰 숫자)
		System.out.println(n[1]);
	}
}