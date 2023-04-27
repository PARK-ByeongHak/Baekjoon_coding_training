import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        String[] restr = str.split("");
        if(restr[n-1].equals("G")) {
        	for(int i=0; i<restr.length-1; i++) {
        		System.out.print(restr[i]);
        	}
        }else {
        	for(int i=0; i<restr.length; i++) {
        		System.out.print(restr[i]);
        	}
        	System.out.print("G");
        }
    }
}