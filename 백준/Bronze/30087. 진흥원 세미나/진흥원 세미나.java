import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();  // 신청한 세미나의 수
        scanner.nextLine();  // 개행 문자 제거

        // 세미나와 교실 매핑 정보
        HashMap<String, String> seminarToClass = new HashMap<>();
        seminarToClass.put("Algorithm", "204");
        seminarToClass.put("DataAnalysis", "207");
        seminarToClass.put("ArtificialIntelligence", "302");
        seminarToClass.put("CyberSecurity", "B101");
        seminarToClass.put("Network", "303");
        seminarToClass.put("Startup", "501");
        seminarToClass.put("TestStrategy", "105");

        // 신청한 세미나별 교실 출력
        for (int i = 0; i < n; i++) {
            String seminar = scanner.nextLine();
            String classroom = seminarToClass.get(seminar);
            System.out.println(classroom);
        }

        scanner.close();
    }
}
