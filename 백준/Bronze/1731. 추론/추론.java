import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] array = new int[n];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        
        sc.close();
        
        boolean arithmetic = false; // 등차수열 여부
        boolean geometric = false;  // 등비수열 여부
        
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i] - array[i+1] == array[i+1] - array[i+2]) {
                arithmetic = true;
            } else {
                arithmetic = false;
                break;
            }
        }
        
        for (int i = 0; i < array.length - 2; i++) {
            if (array[i+1] / array[i] == array[i+2] / array[i+1]) {
                geometric = true;
            } else {
                geometric = false;
                break;
            }
        }
        
        if (arithmetic) {
            System.out.println(array[n-1] + (array[1] - array[0]));
        } else {
            if (geometric)
                System.out.println(array[n-1] * (array[1] / array[0]));
        }
        
        
    }
}