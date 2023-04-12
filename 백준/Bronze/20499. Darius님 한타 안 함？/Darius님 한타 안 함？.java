import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        
        String[] str = x.split("/");
        if(str[1].equals("0")||Integer.parseInt(str[0])+Integer.parseInt(str[2])<Integer.parseInt(str[1])) {
        	System.out.println("hasu");
        }else {
        	System.out.println("gosu");
        }
    }
}