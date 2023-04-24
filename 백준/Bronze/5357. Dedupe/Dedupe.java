import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	for(int i=0; i<t; i++) {
    		String str = sc.next();
    		String[] restr = str.split("");
    		String strcnt = "", answer = "";
    		int cnt = 0;
    		for(int j=0; j<restr.length; j++) {
    			if(restr[j].equals(strcnt)) {
    				continue;
    			}
    			answer+=restr[j];
    			strcnt=restr[j];
    		}
    		System.out.println(answer);
    	}
    }
}