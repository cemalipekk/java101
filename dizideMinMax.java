import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class dizideMinMax {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] list = {15, 12, 788, 1, -1, -788, 2, 0};
        int min = list[0];
        int max = list[0];

        System.out.println("Dizi : " +Arrays.toString(list));
        System.out.print("Girilen Sayi : ");
        int number = inp.nextInt();

        Arrays.sort(list);
        for (int i : list){
            if (i < number){
                min = i;
            }
            if (i > number){
                max = i;
                break;
            }
        }
        System.out.println("Girilen sayidan kucuk en yakin sayi : " + min);
        System.out.println("Girilen sayidan buyuk en yakin sayi : " + max);



    }
}
