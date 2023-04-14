import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next();
        String[] str = a.split("");
        int cnt=0;
        for(int i=0;i<str.length;i++) {
        	if(str[i].equals("a")||str[i].equals("A")||str[i].equals("e")||str[i].equals("E")||str[i].equals("i")||str[i].equals("I")||str[i].equals("o")||str[i].equals("O")||str[i].equals("u")||str[i].equals("U")) {
        		cnt++;
        	}
        }
        System.out.println(cnt);
    }
}