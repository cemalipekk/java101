public class diziHarmonikOrt {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int harmonicSeries = 0;
        int harmonicAverage = 0;
        for (int i = 0; i < numbers.length; i++) {
        harmonicSeries+= 1 / numbers[i];

        }
        harmonicAverage = numbers.length / harmonicSeries;
        System.out.println("Harmonik Ortalama : " + harmonicAverage);



    }
}
