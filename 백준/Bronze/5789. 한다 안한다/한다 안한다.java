import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0; i<a; i++) {
        	String str = sc.next();
        	String[]restr = str.split("");
        	if(restr[restr.length/2-1].equals(restr[restr.length/2])) {
        		System.out.println("Do-it");
        	}else {
        		System.out.println("Do-it-Not");
        	}
        }
    }
}