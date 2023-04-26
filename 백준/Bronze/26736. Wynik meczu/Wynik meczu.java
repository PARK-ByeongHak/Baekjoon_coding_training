import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] restr = str.split("");
        int a = 0, b = 0;
        for(int i=0; i<restr.length; i++) {
        	if(restr[i].equals("A")) {
        		a++;
        	}else if(restr[i].equals("B")){
        		b++;
        	}
        }
        System.out.println(a+" : "+b);
    }
}