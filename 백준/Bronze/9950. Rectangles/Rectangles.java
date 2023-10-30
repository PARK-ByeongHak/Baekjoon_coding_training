import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();

        while (true) {
            // 사각형의 넓이 가로 세로 길이를 입력받는다.
            StringTokenizer st = new StringTokenizer(br.readLine());
            int length = Integer.parseInt(st.nextToken());
            int width = Integer.parseInt(st.nextToken());
            int area = Integer.parseInt(st.nextToken());

            // 3 변수의 값이 모두 0 이면 종료한다.
            if (length == 0 && width == 0 && area == 0) {
                break;
            }
            // 세로 값이 0이라면
            else if (length == 0 && width != 0 && area != 0) {
                length = area / width;
            }
            // 가로 값이 0이라면
            else if (length != 0 && width == 0 && area != 0) {
                width = area / length;
            }
            // 넓이 값이 0이라면
            else if (length != 0 && width != 0 && area == 0) {
                area = width * length;
            }
            // 그외의 경우
            else {
                throw new IOException();
            }
            sb.append(length).append(" ").append(width).append(" ").append(area).append("\n");
        }

        sb.setLength(sb.length() - 1);
        System.out.print(sb);
    }

}