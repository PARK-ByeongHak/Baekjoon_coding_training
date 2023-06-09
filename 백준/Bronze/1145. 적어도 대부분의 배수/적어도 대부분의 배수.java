import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] array = new int[5];

        for (int i = 0; i < 5; i++) {
            array[i] = sc.nextInt();
        }

        int val = 1;
        int cnt = 0;

        while (true) {
            for (int k = 0; k < 5; k++) {
                if (val % array[k] == 0) {
                    cnt++;
                }
            }
            if (cnt >= 3) {
                System.out.println(val);
                return;
            }
            cnt = 0;
            val++;
        }

    }
}