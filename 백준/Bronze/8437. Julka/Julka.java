import java.util.Scanner;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger total = new BigInteger(sc.nextLine());
        BigInteger diff = new BigInteger(sc.nextLine());
        BigInteger two = new BigInteger("2");

        BigInteger klaudia = (total.subtract(diff)).divide(two).add(diff);
        BigInteger natalia = (total.subtract(diff)).divide(two);

        System.out.println(klaudia);
        System.out.println(natalia);
    }
}
