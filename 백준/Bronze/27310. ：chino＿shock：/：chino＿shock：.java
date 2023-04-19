import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        // 원하는 단어 입력 받음
		String str = sc.next();
        // 반복문에서 단어 확인을 위해 배열에 하나씩 삽입
		String[] restr = str.split("");
        // 길이 카운트는 텍스트 길이만큼 미리 카운트하고 콜론과 언더바 카운트는 0으로 초기화
		int lengthCnt=restr.length, colonCnt=0, underBarCnt=0;
		for(int i = 0; i < restr.length; i++) {
			// 콜론 일 경우
            if(restr[i].equals(":")) {
				colonCnt++;
				continue;
			}
            // 언더바 일 경우
			if(restr[i].equals("_")) {
				underBarCnt++;
				continue;
			}
		}
        // 출력하기(언더바는 *5를 해야함)
		System.out.println(lengthCnt+colonCnt+(underBarCnt*5));
		
	}
}