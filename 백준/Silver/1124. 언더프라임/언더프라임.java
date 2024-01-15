import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
    	long answer = 0;
    	
    	int A = s.nextInt();
    	int B = s.nextInt();
    	
    	// 소수 저장
    	int max = B+1; // 최대수까지 소수 목록 체크
    	List<Integer> primeList = new ArrayList<>();
    	Boolean[] primeBl = new Boolean[max];
    	primeBl[0] = false;
    	primeBl[1] = false;
    	for(int i=2; i<max; i++) {
    		if(primeBl[i]!=null && !primeBl[i]) {
                continue;
            }
    		primeBl[i] = true;
    		primeList.add(i);
    		for(int j=i*2; j<max; j+=i) {
    			primeBl[j] = false;
    		}
    	}
    	// 소인수분해 실행
    	for(int i=A; i<=B; i++) {
    		int tmpCnt = 0;
    		int saveI = i;
    		// 애초에 소수면 (1이라 정답이 될 수 없음.)
    		if(primeBl[i]) {
    			continue;
    		}
    		// 연산 수행 : 하나씩 빼서 소인수분해
    		for(int prime : primeList) {
    			while(saveI > 1 && saveI%prime == 0) {
    				tmpCnt++;
    				saveI /= prime;
    			}
    			if(saveI == 1) {
                    break;
                }
    		}
    		// 소인수분해 결과 갯수가 소수이면 정답 추가
    		if(primeBl[tmpCnt]) {
    			answer++;
    		}
    	}
        System.out.println(answer);
    }
}