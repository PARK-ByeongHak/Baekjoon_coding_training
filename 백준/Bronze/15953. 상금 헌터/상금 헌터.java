import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 상금계산을 위한 수 입력
		int n = sc.nextInt();
		// 반복문
		for (int i = 0; i < n; i++) {
			int firstaward = 0;
			int secondaward = 0;
			int a = sc.nextInt();
			if(a!=0&&a<=21) {
				if(a==1) {
					firstaward+=5000000;
				}else if(a<4) {
					firstaward+=3000000;
				}else if(a<7) {
					firstaward+=2000000;
				}else if(a<11) {
					firstaward+=500000;
				}else if(a<16) {
					firstaward+=300000;
				}else {
					firstaward+=100000;
				}
			}
			int b = sc.nextInt();
			if(b!=0&&b<=31) {
				if(b==1) {
					secondaward+=5120000;
				}else if(b<4) {
					secondaward+=2560000;
				}else if(b<8) {
					secondaward+=1280000;
				}else if(b<16) {
					secondaward+=640000;
				}else {
					secondaward+=320000;
				}
			}
			System.out.println(firstaward+secondaward);
		}
	}
}