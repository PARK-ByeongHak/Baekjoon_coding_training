import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input01 = br.readLine().split(" ");
        final int rows = Integer.parseInt(input01[0]);
        final int cols = Integer.parseInt(input01[1]);

        char[][] picture = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            picture[i] = br.readLine().toCharArray();
        }

        //출력
        System.out.print(solution(rows, cols, picture));

    }

    private static String solution(int rows, int cols, char[][] picture) {
        StringBuilder sb = new StringBuilder();
        final int HalfCols = cols / 2;

        for (int i = 0; i < rows; i++) {
            StringBuilder sbBeforeHalf = new StringBuilder();
            StringBuilder sbAfterHalf = new StringBuilder();
            for (int j = 0; j < HalfCols; j++) {
                char curChar = picture[i][j];
                char curCharMatch = picture[i][cols - j - 1];

                if (curChar != curCharMatch) {
                    if (curChar == '.') {
                        sbBeforeHalf.append(curCharMatch);
                        sbAfterHalf.insert(0, curCharMatch);
                    } else if (curCharMatch == '.') {
                        sbBeforeHalf.append(curChar);
                        sbAfterHalf.insert(0, curChar);
                    }
                } else {
                    sbBeforeHalf.append(curChar);
                    sbAfterHalf.insert(0, curChar);
                }
            }
            sb.append(sbBeforeHalf).append(sbAfterHalf);
            sb.append("\n");
        }

        return sb.toString();
    }

}