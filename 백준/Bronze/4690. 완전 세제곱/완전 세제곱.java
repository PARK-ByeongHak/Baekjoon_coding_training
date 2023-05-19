public class Main {

	public static void main(String[] args) {
		//출력 문자열을 입력받고 마지막에 한번에 출력하기 위한 StringBuilder를 생성
		StringBuilder sb = new StringBuilder();
		
		//풀이 방법에서 설명한 4개의 반복문
		for(int a = 2; a <= 100; a++) {
			for(int b = 2; b <= a; b++) {
				for(int c = b; c <= a; c++) {
					for(int d = c; d <= a; d++) {
						//완전세제곱일 경우에 출력문을 출력
						if(a*a*a == b*b*b + c*c*c + d*d*d) {
							System.out.println("Cube = " + a + ", Triple = (" + b + "," + c + "," + d +")");
						}
					}
				}
			}
		}
	}
}