import java.util.Scanner;

public class Main {
    private boolean getResult(int a, int b, String op) {
        switch (op) {
            case ">":   return a > b;
            case ">=":  return a >= b;
            case "<":   return a < b;
            case "<=":  return a <= b;
            case "==":  return a == b;
            case "!=":  return a != b;
        }
        return false;
    }

    private void solution() {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        
        while (true) {
            int a = sc.nextInt();
            String op = sc.next();
            int b = sc.nextInt();
            if (op.equals("E"))
                break;
            
            System.out.printf("Case %d: %s\n", t++, getResult(a, b, op) ? "true" : "false");
        }
        
        sc.close();
    }

    public static void main(String[] args) {
        new Main().solution();
    }
}
