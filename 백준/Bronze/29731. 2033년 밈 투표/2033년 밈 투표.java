import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        boolean hasChangedPledge = false;
        String originalPledge = "Never gonna give you up\nNever gonna let you down\nNever gonna run around and desert you\nNever gonna make you cry\nNever gonna say goodbye\nNever gonna tell a lie and hurt you\nNever gonna stop";
        
        for (int i = 0; i < N; i++) {
            String pledge = scanner.nextLine();
            if (!originalPledge.contains(pledge)) {
                hasChangedPledge = true;
                break;
            }
        }
        
        if (hasChangedPledge) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
