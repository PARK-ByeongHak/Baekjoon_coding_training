import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	
    	for(int i=0; i<a;i++) {
    		List<Integer> num=new ArrayList<Integer>(5);

            for(int j=0;j<3;j++){
                num.add(sc.nextInt());
            }
            System.out.println(Collections.min(num));
    	}
    }
}