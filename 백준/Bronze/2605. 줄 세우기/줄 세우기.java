import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //학생 수 
		
		ArrayList<Integer> List = new ArrayList<>(); // 줄
		
		List.add(-1);
		
		//학생 수만큼 번호 넣기
		for(int i=1;i<=N;i++) {
			int num = sc.nextInt();
			List.add(i-num,i);
		}
		
		for(int i=1;i<=N;i++) System.out.print(List.get(i) + " ");
		
		
	}
}