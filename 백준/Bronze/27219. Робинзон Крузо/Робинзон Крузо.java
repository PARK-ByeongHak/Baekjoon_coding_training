import java.util.*;
import java.io.*;

public class Main{
    public static void main(String [] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a>=5) {
        	System.out.print("V");
        	a-=5;
        }
        while(a>0) {
        	System.out.print("I");
        	a--;
        }
    }
}