import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
    	while(true) {
    		int N = sc.nextInt();
    		if(N==-1) {
    			break;					//입력된 값이 -1이면 종료
    		}
    		int[] array = new int[N];	// 약수가 들어갈 배열
    		int sum = 0;				// 약수들의 합 저장
    		int index = 0;				// 인덱스 돌리기 위한 변수
    		for(int i=1; i<N; i++) {
    			if(N%i==0) {
    				array[index++] = i;	//약수일 경우 배열에 해당 값 삽입 and 약수들의 합에 추가
    				sum+=i;
    			}
    		}
    		if(sum != N) {				// sum의 값이 N 과 같지 않으면(완전수 가 아니면)
				System.out.println(N + " is NOT perfect.");
				continue;				// 완전수가 아니라는 문구를 출력 후 아래의 내용 무시하고 컨티뉴.
			}
    		// 완전수 일 경우 해당 서식에 맞춰 출력
			System.out.print(N + " = ");
			for(int i=0; i<index; i++) {
				if(i == index-1)
					System.out.print(array[i]);
				else
					System.out.print(array[i] + " + ");
			}
			System.out.println();
    	}
    }
}