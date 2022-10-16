public class matrisTranspozu {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("Matris :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "\t");
                //\t ile 8 karakter boşluk bırakıldı.
            }
            System.out.println("");
        }
        System.out.println("Transpoze : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[j][i] + "\t");
                //\t ile 8 karakter boşluk bırakıldı.
            }
            System.out.println("");
        }
    }
}
