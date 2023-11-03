import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);

    	String str = sc.next();
    	String restr[] = str.split("");
    	int count = 0;
    	double score = 0.0;
    	for(int i=0; i<restr.length; i++) {
    		if(restr[i].equals("+")) {
    			score += 0.5;
    		}else {
    			if(restr[i].equals("A")) {
        			score += 4.0;
    			}else if(restr[i].equals("B")) {
        			score += 3.0;
    			}else if(restr[i].equals("C")) {
        			score += 2.0;
    			}else if(restr[i].equals("D")) {
        			score += 1.0;
    			}
    			count++;
    		}
    	}
        DecimalFormat df = new DecimalFormat("#.#####");
        System.out.println(df.format(score / count));
    }
}