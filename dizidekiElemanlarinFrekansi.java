import java.util.Arrays;

public class dizidekiElemanlarinFrekansi {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Array is : " + Arrays.toString(arr));
        int[] duplicate = new int[arr.length];
        int startIndex = 0;
        int again = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i != j) && (arr[i] == arr[j])) {
                    again++;
                }
            }
            if (!isFind(duplicate, arr[i])) {
                System.out.println(arr[i] + "sayisi " + again + "kere takrar edildi");
                duplicate[startIndex++] = arr[i];
            }
            again = 1;

        }
    }

}
