import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int[] str = new int[5];
        
        int sum=0;
        for(int i=0;i<5;i++){
        	str[i] = sc.nextInt();
            sum += str[i];
        }
        System.out.println(sum);
    }
}