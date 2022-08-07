
public class birYuzArasiAsal {
    public static void main(String[] args) {
        int bolenSayac= 0;
        int n = 100;
        System.out.print(2 +" ");
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j<i; j++) {

                if (i % j != 0){
                    bolenSayac++;

                    if (bolenSayac == (i-2)){
                        System.out.print(i+" ");
                        bolenSayac = 0;
                    }
                }else{
                    break;
                }




            }
        }
    }
}
