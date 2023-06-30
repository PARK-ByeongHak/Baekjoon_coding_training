import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.nextLine();
        
        String beforeBits = sc.nextLine();
        String afterBits = sc.nextLine();
        
        boolean deletionSucceeded = true;
        
        if (N % 2 == 0) {
            // If N is even, the deletion will not change the bits
            if (beforeBits.equals(afterBits)) {
                deletionSucceeded = true;
            } else {
                deletionSucceeded = false;
            }
        } else {
            // If N is odd, the deletion will flip the bits
            for (int i = 0; i < beforeBits.length(); i++) {
                if (beforeBits.charAt(i) == afterBits.charAt(i)) {
                    deletionSucceeded = false;
                    break;
                }
            }
        }
        
        if (deletionSucceeded) {
            System.out.println("Deletion succeeded");
        } else {
            System.out.println("Deletion failed");
        }
        
        sc.close();
    }
}
