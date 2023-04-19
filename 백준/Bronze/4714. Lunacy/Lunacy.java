import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        // 값 초기화
		double weightOnEarth = 0.0;
		while(true) {
            // 값 입력받아서 -1.0일 경우 break
			weightOnEarth = sc.nextDouble();
			if(weightOnEarth==-1.0) {
				break;
			}
            // -1.0이 아닌 값이 들어올 경우 계산하여 출력
			double weightOnMoon = weightOnEarth*0.167;
            // 소수점 2번째 자리까지 출력하기 위해 printf 사용
			System.out.printf("Objects weighing %.2f on Earth will weigh %.2f on the moon.\n", weightOnEarth, weightOnMoon);
		}
		
	}
}