import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int days;
        long money, coin = 0;
        int min = 51, max = 0;
        int now = 0;
        int[] price;

        days = Integer.parseInt(st.nextToken());
        money = Long.parseLong(st.nextToken());
        price = new int[days];
        for (int x = 0; x < days; x++) {
            price[x] = Integer.parseInt(br.readLine());
        }
        for (int x = 0; x < days-1; x++) {
            // 이전에 구매한 적 없고, 현재 가격이 다음 가격보다 낮은 경우 -> 구매
            if (coin == 0 && price[x] < price[x + 1]) {
                coin = money / price[x];
                money -= coin * price[x];
            }
            //현재 가격이 다음 가격보다 높을 때 -> 판매
            if (price[x] > price[x + 1]) {
                money += coin * price[x];
                coin = 0;
            }
        }
        // 마지막날은 가지고 있는 코인을 전부 판매한다.
        money += coin * price[days-1];
        System.out.println(money);
    }
}