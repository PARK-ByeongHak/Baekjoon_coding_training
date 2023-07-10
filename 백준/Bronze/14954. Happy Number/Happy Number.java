import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        String unhap = "4";

        do{
            str = happy(str);
            if(str.equals(unhap)) {
                System.out.println("UNHAPPY");
                return ;
            }
        }while(!str.equals("1"));
        System.out.println("HAPPY");
    }

    public static String happy(String origin) {
        int k = 0;
        for(int i=0; i<origin.length(); i++) {
            k +=  Math.pow(Character.getNumericValue(origin.charAt(i)), 2);
        }
       return Integer.toString(k);
    }
}