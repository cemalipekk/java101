import java.util.Scanner;

public class cinzodyagı {
    public static void main(String[] args) {
        int dy,cinzodyagı;

        Scanner inp = new Scanner(System.in);

        System.out.print("Dogum yilinizi giriniz : ");
        dy = inp.nextInt();
         cinzodyagı=dy%12;
         switch (cinzodyagı){
             case 0:
                 System.out.println("Cin Zodyagi Burcunuz : Maymun");
                 break;
             case 1:
                 System.out.println("Cin Zodyagi Burcunuz : Horoz ");
                 break;
             case 2:
                 System.out.println("Cin Zodyagi Burcunuz : Kopek ");
                 break;
             case 3:
                 System.out.println("Cin Zodyagi Burcunuz : Domuz ");
                 break;
             case 4:
                 System.out.println("Cin Zodyagi Burcunuz : Fare ");
                 break;
             case 5:
                 System.out.println("Cin Zodyagi Burcunuz : Okuz ");
                 break;
             case 6:
                 System.out.println("Cin Zodyagi Burcunuz : Kaplan ");
                 break;
             case 7:
                 System.out.println("Cin Zodyagi Burcunuz : Tavsan ");
                 break;
             case 8:
                 System.out.println("Cin Zodyagi Burcunuz : Ejderha ");
                 break;
             case 9:
                 System.out.println("Cin Zodyagi Burcunuz : Yilan ");
                 break;
             case 10:
                 System.out.println("Cin Zodyagi Burcunuz : At");
                 break;
             case 11:
                 System.out.println("Cin Zodyagi Burcunuz : Koyun");
                 break;

         }
    }
}
