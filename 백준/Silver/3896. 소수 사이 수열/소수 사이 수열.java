import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    private static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
    	
    	int T = s.nextInt(); // 테스트 케이스의 수
    	
    	int[] inputArray = new int[T];
    	int max = Integer.MIN_VALUE; // 최대값 별도 저장 (한 번에 찾기 위함)
    	for(int i=0; i<T; i++) {
    		inputArray[i] = s.nextInt();
    		
    		if(max < inputArray[i]) max = inputArray[i];
    	}
    	
    	Boolean[] dp = new Boolean[1299710];
    	dp[0] = true; // 0과 1은 소수가 아님.
    	dp[1] = true;
    	List<Integer> primeList = new LinkedList<>(); // 입력이 잦을 예정이므로 LinkedList 사용
    	
    	for(int i=2; i<1299710; i++) {
    		if(dp[i] != null && dp[i]) continue; // 소수가 아니면 PASS
    		primeList.add(i); // 소수는 저장
    		
    		for(int j=i; j<1299710; j+=i) {
    			dp[j] = true; // 소수의 배수는 소수가 아님.
    		}
    	}
    	
    	// LinkedList로 선언되었기에 빠른 검색을 위해 Array로 변환
    	int[] primeArray = new int[primeList.size()];
    	int count = 0;
    	for(int prime : primeList) {
    		primeArray[count++] = prime;
    	}
    	
    	StringBuffer result = new StringBuffer();
    	String LINE_SWAP="\n";
    	
    	for(int i=0; i<T; i++) {
    		for(int j=0; j<primeArray.length; j++) {
    			Boolean isFound = false;
    			
    			if(inputArray[i] == primeArray[j]) {
    				result.append("0");
    				isFound = true;
    			}
    			else if(inputArray[i] > primeArray[j] && inputArray[i] < primeArray[j+1]) {
    				result.append(primeArray[j+1] - primeArray[j]);
    				isFound = true;
    			}
    			else if(inputArray[i] < primeArray[j] && inputArray[i] > primeArray[j-1]) {
    				result.append(primeArray[j] - primeArray[j-1]);
    				isFound = true;
    			}
    			
    			if(isFound) {
    				if(i != T-1) {
    					result.append(LINE_SWAP);
    				}
    				break;
    			}
    		}
    	}
    	
    	System.out.println(result.toString());
    }
}