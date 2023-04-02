import java.util.*;
import java.io.*;
 
 
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] array = br.readLine().split(" ");
        int a,b,c,e,d,f;
        a= Integer.parseInt(array[0]);
        b= Integer.parseInt(array[1]);
        c= Integer.parseInt(array[2]);
        d= Integer.parseInt(array[3]);
        e= Integer.parseInt(array[4]);
        f= Integer.parseInt(array[5]);
        int X=0;
        int Y=0;
        for(int i=-999; i<1000; i++){
            for(int j=-999; j<1000; j++){
                if((a*i+b*j==c)&&(d*i+e*j==f)){
                    X=i;
                    Y=j;
                    break;
                }
            }
        }
        System.out.println(X +" "+Y);
    }
}