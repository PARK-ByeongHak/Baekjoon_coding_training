import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);

    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	int k = sc.nextInt();
    	int min=1000000;
    	int index = 0;
    	int tempn, tempm, temp;
    	
    	for(int i=1; i<=k;i++) {
    		tempn = sc.nextInt();
    		tempm = sc.nextInt();
    		temp=tempn-1+m-tempm;
    		if(min>temp) {
    			index = i;
    			min = temp;
    		}
    	}
    	System.out.println(index);
    }
}