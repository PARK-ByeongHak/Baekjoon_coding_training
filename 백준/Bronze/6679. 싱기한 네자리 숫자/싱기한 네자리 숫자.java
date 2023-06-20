public class Main {
    public static void main(String[] args) {
        for (int num = 1000; num <= 9999; num++) {
            if (isInterestingNumber(num)) {
                System.out.println(num);
            }
        }
    }

    private static boolean isInterestingNumber(int num) {
        int decimalSum = getDigitSum(num, 10);
        int duodecimalSum = getDigitSum(num, 12);
        int hexSum = getDigitSum(num, 16);
        return (decimalSum == duodecimalSum && duodecimalSum == hexSum);
    }

    private static int getDigitSum(int num, int base) {
        int sum = 0;
        while (num > 0) {
            sum += num % base;
            num /= base;
        }
        return sum;
    }
}
