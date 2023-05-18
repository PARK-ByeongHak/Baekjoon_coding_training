import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for(int i=0; i<t; i++) {
			String str = sc.next();
			String[] restr = str.split("");
			   
			System.out.println("String #"+(i+1));
			for(int j=0; j<restr.length; j++){
			    char tmp = restr[j].charAt(0);
			    tmp += 1;
			    if(tmp == 91){
			    	tmp = 65;
			    }
				System.out.print(tmp);
			}
			System.out.println();
			System.out.println();
		}
	}
}