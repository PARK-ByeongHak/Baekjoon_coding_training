import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
 
        int sheep=1;
        int cnt=0;
        int S=0;
        int G=0;
        for(sheep=1; sheep<n; sheep++) {
            if(sheep*a+(n-sheep)*b==w) {
                //해를 찾았을 때, 정답의 수 증
                cnt++;
                //정답일때의 양과 염소의 수 저장
                S = sheep;
                G = n-sheep;
            }
        }
        // 하나의 해만 있을때, 양과 염소의 수 출력
        if(cnt==1) System.out.println(S +" "+ G);
        // 그렇지 않으면 -1
        else System.out.println("-1");
    }
}