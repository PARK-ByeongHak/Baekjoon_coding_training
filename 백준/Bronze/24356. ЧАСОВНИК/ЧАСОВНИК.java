import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t1 = sc.nextInt();
        int m1 = sc.nextInt();
        int t2 = sc.nextInt();
        int m2 = sc.nextInt();
        int time = 0;
        if(t1*60+m1>t2*60+m2) {
        	t2+=24;
        	time = (t2*60+m2)-(t1*60+m1);
        }else {
        	time = (t2*60+m2)-(t1*60+m1);
        }
        int a = 0, score=time;
        while(true) {
        	if(score<30)break;
        	score-=30;
        	a++;
        }
        System.out.println(time+" "+a);
    }
}
