import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int cases = Integer.parseInt(br.readLine());
            if (cases == -1) break;

            int miles = 0;
            int hours = 0;

            for (int i = 0; i < cases; i++) {
                String[] tokens = br.readLine().split(" ");
                int mph = Integer.parseInt(tokens[0]);
                int eth = Integer.parseInt(tokens[1]);
                miles += (mph * (eth - hours));
                hours = eth;
            }

            System.out.println(miles + " miles");
        }
    }
}
