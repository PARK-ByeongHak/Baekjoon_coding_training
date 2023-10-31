import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            long a = Long.parseLong(input[0]);
            long b = Long.parseLong(input[1]);

            List<Long> v = new ArrayList<>();
            boolean flag = false;

            while (true) {
                v.add(a % b);
                a /= b;
                if (a == 0) break;
            }

            int left = 0;
            int right = v.size() - 1;

            while (left <= right) {
                if (v.get(left).equals(v.get(right))) {
                    left++;
                    right--;
                } else {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.println("0");
            } else {
                System.out.println("1");
            }
        }
    }
}
