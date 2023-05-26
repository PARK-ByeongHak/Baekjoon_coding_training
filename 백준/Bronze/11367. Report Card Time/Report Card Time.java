import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int i=0; i<T; i++) {
        	String str = sc.next();
        	int n = sc.nextInt();
        	System.out.print(str+" ");
        	if(n>96&&n<=100) {
        		System.out.println("A+");
        	}else if(n>89&&n<=96) {
        		System.out.println("A");
        	}else if(n>86&&n<=89) {
        		System.out.println("B+");
        	}else if(n>79&&n<=86) {
        		System.out.println("B");
        	}else if(n>76&&n<=79) {
        		System.out.println("C+");
        	}else if(n>69&&n<=76) {
        		System.out.println("C");
        	}else if(n>66&&n<=69) {
        		System.out.println("D+");
        	}else if(n>59&&n<=66) {
        		System.out.println("D");
        	}else {
        		System.out.println("F");
        	}
        }
    }
}