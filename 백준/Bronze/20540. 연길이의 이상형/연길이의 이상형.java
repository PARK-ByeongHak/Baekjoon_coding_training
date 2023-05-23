import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String[] restr = str.split("");
        if(restr[0].equals("E")) {
        	restr[0]="I";
        }else {
        	restr[0]="E";
        }
		if(restr[1].equals("S")) {
        	restr[1]="N";
		}else {
        	restr[1]="S";
		}
		if(restr[2].equals("T")) {
        	restr[2]="F";
		}else {
        	restr[2]="T";
		}
		if(restr[3].equals("J")) {
        	restr[3]="P";
		}else {
        	restr[3]="J";
		}
		for(int i=0;i<restr.length; i++) {
			System.out.print(restr[i]);
		}
	}
}