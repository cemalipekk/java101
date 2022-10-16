import java.util.Scanner;

public class dizidekiElemanSiralama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int N = inp.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print(i + 1 + ". Elemani : ");
            array[i] = inp.nextInt();

        }
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (array[j] < array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        // yukarıda ki kod yerine Arrays.sort metodu kullanılabilir
        // Arrays.sort(array); gibi
        System.out.print("Siralama :");
        for (int i = 0; i < N; i++) {
            System.out.print("\t" +array[i]);
        }



    }
}
