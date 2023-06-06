import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] array = new int [1001];
        for(int i=0;i<10;i++){
            int elem = sc.nextInt();
            sum+=elem;
            array[elem]++;
            
        }

        int index = 0;
        int max = 0;
        for(int i=0;i<1001;i++){
            if(max<array[i]){
                max=array[i];
                index = i;
            }
        }

        System.out.print((sum/10)+"\n"+index);
    }
}