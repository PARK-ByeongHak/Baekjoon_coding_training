import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());
        long t = 2432902008176640000L;

        if (n == 0) {
            n = -1;
        }

        for (int i = 20; i > 0; i--) {
            t /= i;
            if (n >= t) {
                n -= t;
            }
        }

        System.out.println(n != 0 ? "NO" : "YES");
    }
}
