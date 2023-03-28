import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
        //알파벳 길이만큼 선언
		int[] array = new int[26];
		
        //기본값(문자열 내에 존재하지 않는 경우)인 -1 삽입
		for(int i = 0; i < array.length; i++) {
			array[i] = -1;
		}
        
		String text = sc.nextLine();
 
		for(int i = 0; i < text.length(); i++) {
			char abc = text.charAt(i);
            // array 원소 값이 -1 인 경우에만 초기화
			if(array[abc - 'a'] == -1) {	
				array[abc - 'a'] = i;
			}
		}
        // 배열 출력
		for(int val : array) {
			System.out.print(val + " ");
		}
	}
}