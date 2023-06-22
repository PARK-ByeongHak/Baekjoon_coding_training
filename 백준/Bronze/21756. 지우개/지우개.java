import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(); // 배열은 시간초과 발생함

        for(int i = 1; i <= n; i++) {
            arr.add(i);
        }

        while(arr.size() >= 2) {
            for(int i = 0; i < arr.size(); i++) {
                arr.remove(i);
            }
        }
        System.out.println(arr.get(0));
    }
}