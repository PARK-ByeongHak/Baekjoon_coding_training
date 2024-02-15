import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    
    static Scanner scanner = new Scanner(System.in);
    static int num_rolecake = scanner.nextInt(); // 롤케이크 개수
    static int num_cutting = scanner.nextInt(); // 최대 자를 수 있는 횟수
    static int count = 0; //길이가 10인 롤케이크 개수
 
    public static void main(String[] args) {
        int len_rolecake[] = new int[num_rolecake];//롤케이크 길이를 저장할 배열
        int rest[] = new int[num_rolecake];//10으로 나눠떨어지지 않는 롤케이크의 길이를 임시로 저장해둘 배열
        int index=0;
        for(int i =0; i<num_rolecake; i++) { //롤케이크 길이를 입력받는다.
            len_rolecake[i]=scanner.nextInt();
        }
        
        Arrays.sort(len_rolecake); //10으로 나눠떨어지는것들 중 작은 길이의 것부터 잘라주는 것이 이득이므로 정렬해준다. 
        
        
        for(int i=0;i<num_rolecake;i++) {
            if(len_rolecake[i]==10)count++; //롤케잌 자체의 길이가 10이면, 자르지 않고 개수만 +1
            
            if(len_rolecake[i]>10) {
                if(len_rolecake[i]%10==0)cut(len_rolecake[i]); //롤케잌 길이가 10으로 나눠떨어지는것들에 대해 먼저 자르기 시작
                else rest[index++] = len_rolecake[i]; // 10으로 나눠떨어지지 않는 것들은 배열에 저장해두었다가 커팅횟수가 남으면 그때 자르기
                
            }
            
        }
        
        if(num_cutting>0) { //10으로 나눠떨어지는 롤케잌들을 다 자르고도 커팅횟수가 남았으면 
            for(int j=0; j<index; j++) cut(rest[j]); //나머지에 대해서도 커팅을 진행해준다. 
        }
        
        System.out.println(count);
        
        
 
    }
    public static void cut(int len){
        if(num_cutting<=0) return; // 최대커팅횟수를 넘지 않게 자를 수 있다. 
        else {count++;
            num_cutting--;
            int length = len-10; // 한번 자르고 남은 롤케잌의 길이
            if(length>10) {
                cut(length); // 남은 롤케잌의 길이가 10보다 길다면 재귀함수를 이용해서 다시 cut 함수를 실행해준다. 
            }else {
                if(length ==10) count++; //마지막 남은 조각의 길이가 10이라면 길이가10인 롤케잌 개수 +1을 해줌. 
                return;
            }
        }
    }
}