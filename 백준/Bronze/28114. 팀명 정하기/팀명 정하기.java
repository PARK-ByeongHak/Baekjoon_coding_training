import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] problems = new int[3];
        int[] years = new int[3];
        String[] lastNames = new String[3];

        for (int i = 0; i < 3; i++) {
            problems[i] = sc.nextInt();
            years[i] = sc.nextInt();
            lastNames[i] = sc.next();
        }

        String teamName1 = createTeamName1(years);
        System.out.println(teamName1);

        String teamName2 = createTeamName2(problems, lastNames);
        System.out.println(teamName2);
    }

    public static String createTeamName1(int[] years) {
        int[] remainders = new int[3];
        for (int i = 0; i < 3; i++) {
            remainders[i] = years[i] % 100;
        }

        // Bubble Sort로 remainders를 오름차순 정렬
        for (int i = 0; i < 3 - 1; i++) {
            for (int j = 0; j < 3 - i - 1; j++) {
                if (remainders[j] > remainders[j + 1]) {
                    int temp = remainders[j];
                    remainders[j] = remainders[j + 1];
                    remainders[j + 1] = temp;
                }
            }
        }

        String teamName1 = "";
        for (int i = 0; i < 3; i++) {
            teamName1 += String.valueOf(remainders[i]);
        }

        return teamName1;
    }

    public static String createTeamName2(int[] problems, String[] lastNames) {
        // 세 팀원의 정보를 문제 수를 기준으로 내림차순으로 정렬
        for (int i = 0; i < 3 - 1; i++) {
            for (int j = 0; j < 3 - i - 1; j++) {
                if (problems[j] < problems[j + 1]) {
                    int tempProblems = problems[j];
                    problems[j] = problems[j + 1];
                    problems[j + 1] = tempProblems;

                    String tempLastName = lastNames[j];
                    lastNames[j] = lastNames[j + 1];
                    lastNames[j + 1] = tempLastName;
                }
            }
        }

        // 정렬된 성씨의 첫 글자를 이어 붙임
        String teamName2 = "";
        for (int i = 0; i < 3; i++) {
            teamName2 += lastNames[i].charAt(0);
        }

        return teamName2;
    }
}
