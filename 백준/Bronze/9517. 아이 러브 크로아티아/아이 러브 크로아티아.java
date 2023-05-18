import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int K = scan.nextInt();	// 폭탄 들고있는 사람 번호
		int N = scan.nextInt();	// 질문의 개수
		int[] arr = new int[N];
		char[] cArr = new char[N];
		int time = 0;	// 총 시간
		
		scan.nextLine();
		
		// 각 질문 대답 시간, 대답 입력받기
		for(int i=0; i<N; i++) {
			String str = scan.nextLine();
			String[] sArr = str.split(" ");
			arr[i] = Integer.parseInt(sArr[0]);
			cArr[i] = sArr[1].charAt(0);
		}
		
		for(int i=0; i<N; i++) {
			time += arr[i];
			if(time >= 210)	break;		// 210초 지날경우 폭탄 터짐
			if(cArr[i] == 'T')	K += 1;	// 대답이 정답인경우: 폭탄 왼쪽으로 이동
			if(K > 8)	K = 1;			// 8번 사람 -> 1번 사람에게 폭탄 전달
		}
		
		System.out.println(K);
		scan.close();

	}

}
