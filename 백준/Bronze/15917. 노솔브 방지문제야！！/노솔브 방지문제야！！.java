import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int Q = Integer.parseInt(br.readLine());
        for (int i = 0; i < Q; i++) {
            long a = Long.parseLong(br.readLine());
            bw.write((a & -a) == a ? "1\n" : "0\n");
        }

        br.close();
        bw.close();
    }
}
