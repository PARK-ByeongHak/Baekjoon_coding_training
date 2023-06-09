import java.util.*;
 
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
 
        int array[] = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = sc.nextInt();
        }
 
        boolean chk = true;
        while (chk) {
            chk = false;
            for (int i = 0; i < 4; i++) {
                if (array[i] > array[i + 1]) {
                    chk = true;
 
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
 
                    for (int j = 0; j < 5; j++) {
                        sb.append(array[j] + " ");
                    }
                    sb.append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
