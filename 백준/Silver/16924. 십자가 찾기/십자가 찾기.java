import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 행
        int M = Integer.parseInt(st.nextToken()); // 열

        char[][] inputArr = new char[N][M]; // 입력 배열
        boolean[][] visited = new boolean[N][M]; // 방문 여부 배열
        ArrayList<ArrayList<Integer>> answerList = new ArrayList<>(); // 결과를 저장할 리스트

        // 입력 받기
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                inputArr[i][j] = line.charAt(j);
            }
        }

        // 주어진 배열을 탐색하면서 4방향으로 '*'인 도형을 찾기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int size = 0; // '*'를 중심으로 얼마나 큰 도형인지 저장할 변수
                if (inputArr[i][j] == '*') {
                    for (int k = 1; ; k++) {
                        // 현재 위치에서 k만큼 떨어진 위치에 '*'가 있는지 확인
                        if (i - k >= 0 && j-k >=0 && i + k < N && j + k < M) {
                            if (inputArr[i - k][j] == '*' && inputArr[i + k][j] == '*'
                                    && inputArr[i][j - k] == '*' && inputArr[i][j + k] == '*') {
                                // 4방향에 모두 '*'가 있다면 크기를 업데이트
                                size = k;
                            } else {
                                // '*'가 아닌 문자가 하나라도 있으면 종료
                                break;
                            }
                        } else {
                            // 범위를 벗어나면 종료
                            break;
                        }
                    }
                }

                // '*'를 중심으로 size 크기의 도형이 있다면 결과 리스트에 추가하고 방문 처리하기
                if (size > 0) {
                    visited[i][j] = true; // 중심점 방문 처리

                    // 4방향에 있는 '*'도 방문 처리하기
                    for (int k = size; k > 0; k--) {
                        // 결과 리스트에 추가
	                    answerList.add(new ArrayList<>(Arrays.asList(i+1, j+1, k)));
                    
                        visited[i + k][j] = true;
                        visited[i - k][j] = true;
                        visited[i][j + k] = true;
                        visited[i][j - k] = true;
                    }
                }
            }
        }

        // 입력 배열을 전부 방문했는지 확인
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                // 방문하지 않았는데 '*'이 남아 있다면 종료
                if (inputArr[i][j] == '*' && !visited[i][j]) {
                    System.out.println(-1);
                    return;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(answerList.size()).append("\n");

        
        for (ArrayList<Integer> inList : answerList) {
            sb.append(inList.get(0)).append(" ").append(inList.get(1)).append(" ")
                    .append(inList.get(2)).append("\n");
        }

        System.out.println(sb);
    }
}