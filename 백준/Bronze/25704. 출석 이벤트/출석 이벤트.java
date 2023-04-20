import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int min = b;
    	for (int i = 1; i <= 4; i++) {
            if (i*5>a) break;
            switch (i) {
                case 1 : min = Math.min(min, b-500); break;
                case 2 : min = Math.min(min, (int)(b*0.9)); break;
                case 3 : min = Math.min(min, b-2000); break;
                case 4 : min = Math.min(min, (int)(b*0.75)); break;
            }
        }
        System.out.println(min<0?0:min);
    }
}
