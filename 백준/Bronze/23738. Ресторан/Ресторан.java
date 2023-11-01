import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // 입력 받기
        String[] characters = input.split(""); // 문자열을 문자 단위로 분해
        String output = "";

        for (String character : characters) {
            switch (character) {
                case "A":
                    output += "A";
                    break;
                case "B":
                    output += "V";
                    break;
                case "E":
                    output += "YE";
                    break;
                case "K":
                    output += "K";
                    break;
                case "M":
                    output += "M";
                    break;
                case "H":
                    output += "N";
                    break;
                case "O":
                    output += "O";
                    break;
                case "P":
                    output += "R";
                    break;
                case "C":
                    output += "S";
                    break;
                case "T":
                    output += "T";
                    break;
                case "Y":
                    output += "U";
                    break;
                case "X":
                    output += "H";
                    break;
            }
        }

        String result = output.toLowerCase(); // 결과를 소문자로 변환
        System.out.println(result);
    }
}
