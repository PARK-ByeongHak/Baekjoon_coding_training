import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, cnt=0;
        
        a = sc.nextInt();
        int arrayA[] = new int[a];
        int arrayB[] = new int[a];
        for(int i=0; i<a; i++) {
        	arrayA[i] = sc.nextInt();
        }
        for(int i=0; i<a; i++) {
        	arrayB[i] = sc.nextInt();
        }
        for(int i=0; i<a; i++) {
        	if(arrayA[i]>arrayB[i]) {
        		cnt+=(arrayA[i]-arrayB[i]);
        		arrayB[i] = arrayA[i];
        	}else if(arrayA[i]<arrayB[i]) {
        		cnt+=(arrayB[i]-arrayA[i]);
        		arrayB[i] = arrayA[i];
        	}
        }
        System.out.println(cnt/2);
    }
}