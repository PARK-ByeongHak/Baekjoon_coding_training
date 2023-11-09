import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 단어의 개수 입력
        int N = sc.nextInt();
        sc.nextLine(); // 개행 문자 처리

        // 중복 제거를 위한 HashSet
        HashSet<String> set = new HashSet<>();

        // 단어를 입력하고 HashSet에 저장
        for (int i = 0; i < N; i++) {
            String word = sc.nextLine();
            set.add(word);
        }

        // HashSet을 배열로 변환
        String[] words = set.toArray(new String[0]);

        // 길이가 짧은 것부터, 길이가 같으면 사전 순으로 정렬
        Arrays.sort(words, (a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            }
            return Integer.compare(a.length(), b.length());
        });

        // 정렬된 단어 출력
        for (String word : words) {
            System.out.println(word);
        }
    }
}
