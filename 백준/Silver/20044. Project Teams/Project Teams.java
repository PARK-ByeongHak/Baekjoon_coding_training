import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int team_number, min_value, result;
        team_number=sc.nextInt(); //몇개의 팀으로 구성될지 입력 
        int score[] = new int[2*team_number]; //각 팀은 2명으로 구성
        
        for(int i = 0; i<score.length; i++) { // 각 학생의 점수 입력
            score[i] = sc.nextInt();
        }
        
        Arrays.sort(score); // 입력받은 점수들을 오름차순으로 정렬
        min_value = 300000; // 절대 나올 수 없는 값으로 min값을 설정 
        
        for(int j = 0; j<team_number; j++) {
            result = score[j]+score[team_number*2-(j+1)]; //최솟값을 최대가 되게 해주어야하기때문에, 정렬된 점수들을 다음과 같이 2개씩 더해준다.(가우스 덧셈을 연상해보면 쉽게 이해 가능)
            if(min_value>result) min_value=result; // 최솟값을 출력해줘야하기 때문에, 더한 값이 현재의 최솟값보다 작다면 최솟값을 update해준다. 
        }
        System.out.println(min_value); // 최솟값을 출력해준다. 
    }
}