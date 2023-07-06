import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // 0 혹은 공백으로 구분된 일련의 숫자들을 입력합니다.
            String input = scanner.nextLine();

            // 결과를 저장하는 변수를 선언합니다.
            StringBuilder result = new StringBuilder();

            // 입력값이 0 하나라면
            if (input.equals("0")) {
                // 반복문을 탈출하고 종료합니다.
                break;
            }
            // 입력값이 공백으로 구분된 일련의 숫자라면
            else {
                // 숫자들을 공백으로 구분해 배열 형태로 저장하는 변수를 선언합니다.
                String[] numbers = input.split(" ");

                // 배열 변수에서 맨 앞에 있는 숫자는 N입니다.
                // 0 <= N <= 25
                int N = Integer.parseInt(numbers[0]);
                // 배열 변수에서 그 이후에 있는 숫자들은 방문자들이 제출한 값들입니다.
                // 1부터 99 사이의 수입니다.
                numbers = Arrays.copyOfRange(numbers, 1, numbers.length);

                // 일단 결과 변수에는 방문자들이 제출한 값 중 맨 앞에 있는 값과 공백을 넣어줍니다.
                result.append(numbers[0]).append(" ");

                // 방문자들이 제출한 숫자 중 두 번째부터 끝까지 반복해봅니다.
                for (int index = 1; index < N; index++) {
                    // 배열 변수에서 현재 숫자가 바로 앞의 숫자와 똑같은 숫자가 아니라면
                    if (!numbers[index - 1].equals(numbers[index])) {
                        // 결과 변수에 현재 숫자와 공백을 넣어줍니다.
                        result.append(numbers[index]).append(" ");
                    }
                }

                // 출력 형식에 맞게 결과 변수의 값을 출력합니다.
                System.out.println(result + "$");
            }
        }

        scanner.close();
    }
}
