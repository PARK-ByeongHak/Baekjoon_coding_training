import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

    	int[] A = {sc.nextInt(), sc.nextInt()};
    	int[] B = {sc.nextInt(), sc.nextInt()};
    	int[] C = {sc.nextInt(), sc.nextInt()};
    	
    	int x, y;
    	
    	if(A[0]==B[0]) {
    		x = C[0];
    	}else if(A[0]==C[0]) {
    		x = B[0];
    	}else {
    		x = A[0];
    	}
    	if(A[1]==B[1]) {
    		y = C[1];
    	}else if(A[1]==C[1]) {
    		y = B[1];
    	}else {
    		y = A[1];
    	}
    	System.out.println(x + " " + y);
    }
}