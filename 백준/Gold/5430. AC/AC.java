import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 개수

        for (int t = 0; t < T; t++) {
            String p = sc.next(); // 수행할 함수
            int n = sc.nextInt(); // 배열에 들어있는 수의 개수
            sc.nextLine(); // 다음 줄로 넘어가기 위해 필요
            String arrayString = sc.nextLine();
            String[] arrayElements = arrayString.substring(1, arrayString.length() - 1).split(",");
            ArrayDeque<Integer> deque = new ArrayDeque<>();

            for (String element : arrayElements) {
                if (!element.isEmpty()) {
                    deque.add(Integer.parseInt(element.trim()));
                }
            }

            boolean isReversed = false;
            boolean isError = false;

            for (char c : p.toCharArray()) {
                if (c == 'R') {
                    isReversed = !isReversed; // 뒤집기
                } else if (c == 'D') {
                    if (deque.isEmpty()) {
                        isError = true; // 에러 발생
                        break;
                    }
                    if (isReversed) {
                        deque.removeLast(); // 뒤집혀 있으면 마지막 원소 제거
                    } else {
                        deque.removeFirst(); // 뒤집혀 있지 않으면 첫 번째 원소 제거
                    }
                }
            }

            if (isError) {
                System.out.println("error");
            } else {
                StringBuilder sb = new StringBuilder("[");
                while (!deque.isEmpty()) {
                    sb.append(isReversed ? deque.removeLast() : deque.removeFirst());
                    if (!deque.isEmpty()) {
                        sb.append(",");
                    }
                }
                sb.append("]");
                System.out.println(sb.toString());
            }
        }
        sc.close();
    }
}
