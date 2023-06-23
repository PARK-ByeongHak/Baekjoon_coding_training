import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt(); // 테스트 케이스의 개수

        for (int t = 0; t < K; t++) {
            int P = scanner.nextInt(); // 참가자의 수
            int M = scanner.nextInt(); // 자리의 수

            Set<Integer> seats = new HashSet<>(); // 사용된 자리를 저장하는 집합
            int count = 0; // 대회에 참가하지 못하는 사람의 수

            for (int i = 0; i < P; i++) {
                int seat = scanner.nextInt(); // 참가자가 원하는 자리

                if (seats.contains(seat)) {
                    count++;
                } else {
                    seats.add(seat);
                }
            }

            System.out.println(count);
        }
    }
}
