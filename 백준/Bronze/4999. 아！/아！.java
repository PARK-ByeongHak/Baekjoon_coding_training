import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);

    	String n= sc.nextLine();
    	String k= sc.nextLine();
    	if(n.length()>=k.length()) {
    		System.out.println("go");
    	}else {
    		System.out.println("no");
    	}
    	
    }
}