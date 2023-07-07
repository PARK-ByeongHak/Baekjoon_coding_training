import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int HH = scanner.nextInt();
        int MM = scanner.nextInt();
    
        int minutes = correct(HH, MM);
    
        System.out.println(minutes);
    }

    public static int correct(int HH, int MM) {
        LocalTime start_time = LocalTime.of(9, 0);
        LocalTime end_time = LocalTime.of(HH, MM);
    
        Duration duration = Duration.between(start_time, end_time);
    
        return (int) duration.toMinutes();
    }
}