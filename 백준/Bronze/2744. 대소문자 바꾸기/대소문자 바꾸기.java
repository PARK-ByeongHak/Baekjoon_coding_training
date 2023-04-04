import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] array = str.toCharArray();
		
		// a ~ z 97 ~122
		// A ~ Z 65~90
		
        for(int i = 0; i < array.length; i++) {
            if(65 <= array[i] && array[i] <= 90) {
              array[i] = (char) (array[i] + 32);
              continue;
            }
            if(97 <= array[i] && array[i] <= 122) {
              array[i] = (char) (array[i] - 32);
              continue;
            }
          }
          System.out.println(array);
    }
}