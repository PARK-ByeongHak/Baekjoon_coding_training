import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String[] str = n.split("");
        if(str[0].equals("5")&&str[1].equals("5")&&str[2].equals("5")){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}