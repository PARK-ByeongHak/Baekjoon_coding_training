import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {// 0이 들어올때까지 무한반복
			String str = sc.next();
			int length=0;
			if(str.equals("0")) {
				break;
			}
			String[] restr = str.split("");// 숫자을 배열에 분리해 삽입
			for(int i=0; i<restr.length; i++) {
				if(restr[i].equals("1")) {// 1일 경우 2추가
					length+=2;
				}else if(restr[i].equals("0")) {// 0일 경우 4 추가
					length+=4;
				}else {// 그외 3 추가
					length+=3;
				}
				if(i+1!=restr.length) {// 숫자 사이마다 1추가
					length++;
				}
			}
			length+=2;// 판과 가장자리의 숫자 사이의 공간 1. 양쪽이니까 2 추가
			System.out.println(length);// 출력
		}
	}
}	