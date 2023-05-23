import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 처리
        
        for (int i = 0; i < T; i++) {
            String input = scanner.nextLine();
            String[] tokens = input.split(" ");
            
            double value = Double.parseDouble(tokens[0]);
            String unit = tokens[1];
            
            double convertedValue = convertUnit(value, unit);
            
            System.out.printf("%.4f %s\n", convertedValue, getConvertedUnit(unit));
        }
        
        scanner.close();
    }
    
    private static double convertUnit(double value, String unit) {
        if (unit.equals("kg")) {
            return value * 2.2046;
        } else if (unit.equals("lb")) {
            return value * 0.4536;
        } else if (unit.equals("l")) {
            return value * 0.2642;
        } else if (unit.equals("g")) {
            return value * 3.7854;
        }
        return value; // 변환할 단위가 없는 경우 그대로 반환
    }
    
    private static String getConvertedUnit(String unit) {
        if (unit.equals("kg")) {
            return "lb";
        } else if (unit.equals("lb")) {
            return "kg";
        } else if (unit.equals("l")) {
            return "g";
        } else if (unit.equals("g")) {
            return "l";
        }
        return unit; // 변환할 단위가 없는 경우 그대로 반환
    }
}
