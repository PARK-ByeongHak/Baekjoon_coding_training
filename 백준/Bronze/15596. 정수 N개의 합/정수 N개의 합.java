public class Test {
    public long sum(int[] a) {
        long totalSum = 0;
        
        for (int i = 0; i < a.length; i++) {
            totalSum += a[i];
        }
        
        return totalSum;
    }
}
