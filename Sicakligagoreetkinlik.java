import java.util.Scanner;

public class Sicakligagoreetkinlik {
    public static void main(String[] args) {
        float heat;
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Lutfen Sicakligi Giriniz : ");
        heat = inp.nextFloat();

        if (heat<5){
            System.out.println("Hava kayak yapmaya uygun kayak yapmaya gidebilirsiniz :))");
        }
        else if (heat>5 && heat<15) {
            System.out.println("Hava Sinemaya gitmek icin cok guzel Sinemaya gidebilrisiniz :)) ");
        }
        else if (heat>15 && heat<25) {
            System.out.println("Hava Bahar havasi gibi Piknige gidebilirsin");
        }
        else if (heat>25) {
            System.out.println("Hava yaz havasi olmus yüzmeye gidebilirsin");
        }

    }
}
