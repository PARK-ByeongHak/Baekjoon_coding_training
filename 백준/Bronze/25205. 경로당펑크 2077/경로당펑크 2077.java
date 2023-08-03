import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        final String input01 = br.readLine();
        final String input02 = br.readLine();
        System.out.print(solve(input02));
    }

    private static String solve(String input02) {
        // 마지막 단어에 받침 종성 존재 여부
        return !isJoongSung(input02.charAt(input02.length()-1)) ? "1" : "0";
    }

    // 한글 중성 판별 method
    // ㅏ, ㅐ, ㅑ, ㅒ, ㅓ, ㅔ, ㅕ, ㅖ, ㅗ, ㅘ, ㅙ, ㅚ, ㅛ, ㅜ, ㅝ, ㅞ, ㅟ, ㅠ, ㅡ, ㅢ, ㅣ
    private static boolean isJoongSung(char lastChar) {
        boolean isJoongSung = false;
        switch (lastChar){
            case 'y':
            case 'u':
            case 'i':
            case 'o':
            case 'p':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'b':
            case 'n':
            case 'm':
                isJoongSung = true;
                break;
            default:
                break;
        }
        return isJoongSung;
    }

}