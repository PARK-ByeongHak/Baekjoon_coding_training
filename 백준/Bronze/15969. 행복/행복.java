import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] array = new int[1000];

    int Student = sc.nextInt();
    int min = 1000;
    int max = 0;
    for(int i=0; i<Student; i++) {
        array[i]=sc.nextInt();
    }
    for(int i=0; i<Student; i++) {
        if(max<array[i]) max=array[i];
        if(min>array[i]) min=array[i];
    }
    System.out.println(max-min);
    }
}