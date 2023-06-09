import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[10];
        int[] array2 = new int[10];
 
        for(int i=0; i<10; i++){
            array1[i] = sc.nextInt();
        }
        for(int i=0; i<10; i++){
            array2[i] = sc.nextInt();
        }
 
        Arrays.sort(array1);
        Arrays.sort(array2);
 
        System.out.print(array1[9]+array1[8]+array1[7]+" ");                                                   
        System.out.print(array2[9]+array2[8]+array2[7]);
 
    }
}
