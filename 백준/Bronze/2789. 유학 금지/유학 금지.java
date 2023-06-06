import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	String str = sc.next();
        String[] s = new String[str.length()];

        for (int i = 0 ; i < str.length(); i++){
            s[i] = String.valueOf(str.charAt(i));
        }
        // 해당하는 단어 검열
        for (int i = 0 ; i < s.length; i++) {
            if (s[i].equals("C") ) {
                s[i] = "";
            } else if (s[i].equals("A") ) {
                s[i] = "";
            } else if (s[i].equals("M") ) {
                s[i] = "";
            } else if (s[i].equals("B") ) {
                s[i] = "";
            } else if (s[i].equals("R") ) {
                s[i] = "";
            } else if (s[i].equals("I") ) {
                s[i] = "";
            } else if (s[i].equals("D") ) {
                s[i] = "";
            } else if (s[i].equals("G") ) {
                s[i] = "";
            } else if (s[i].equals("E") ) {
                s[i] = "";
            }
        }
        
        String start = s[0];
        for (int i = 1 ; i < s.length; i++) {
            s[0] += s[i];
        }
        System.out.println(s[0]);
    }
}