import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Emptybottle = sc.nextInt();
        int Getbottle = sc.nextInt();
        int Needbottle = sc.nextInt();

        int sum = Emptybottle + Getbottle;
        int nmg = 0;
        int count = 0;

        while (sum >= Needbottle) {
            int drink = sum / Needbottle; // 마신 빈 병의 개수
            count += drink; // 마신 음료의 개수
            nmg = sum % Needbottle; // 남은 빈 병의 개수
            sum = drink + nmg; // 마신 빈 병과 남은 빈 병을 합침
        }

        System.out.println(count);
    }
}
