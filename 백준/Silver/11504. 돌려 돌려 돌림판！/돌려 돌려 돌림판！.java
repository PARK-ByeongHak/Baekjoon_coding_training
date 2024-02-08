import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(br.readLine());

        for (int t = 0; t < test; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            String[] xStr = br.readLine().split(" ");
            String[] yStr = br.readLine().split(" ");
            int x = Integer.parseInt(String.join("", xStr));
            int y = Integer.parseInt(String.join("", yStr));

            String[] lis = br.readLine().split(" ");

            String[] res = new String[lis.length];
            int cnt = 0;

            for (int i = 0; i < lis.length; i++) {
                StringBuilder stBuilder = new StringBuilder();

                if (i + m - 1 < lis.length) {
                    for (int j = i; j < i + m; j++) {
                        stBuilder.append(lis[j]);
                    }
                } else {
                    int k = i + m - n;
                    for (int j = i; j < lis.length; j++) {
                        stBuilder.append(lis[j]);
                    }
                    for (int j = 0; j < k; j++) {
                        stBuilder.append(lis[j]);
                    }
                }

                res[i] = stBuilder.toString();
            }

            for (String r : res) {
                int num = Integer.parseInt(r);
                if (x <= num && num <= y) {
                    cnt++;
                }
            }

            System.out.println(cnt);
        }

        br.close();
    }
}
