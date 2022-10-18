import java.util.Arrays;

public class dizideTekrarEdenCiftSayi {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 2, 3, 4, 9, 1, 2, 3, 4, 9, 6, 8, 6, 2};
        Arrays.sort(arr);
        int[] arr2 = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i != j) && (arr[i] == arr[j]) && (arr[i] % 2 == 0)) {
                    if (!isFind(arr2, arr[i])) {
                        arr2[k++] = arr[j];
                    }
                    break;
                }
            }
        }


        for (int value : arr2) {
            if (value != 0) {
                System.out.print(value + " ");
            }
        }
    }
    }
