package d1_wrapperclass;

import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {

        // kullanicini girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini ekrana yazdiran programi yaziniz

       // not bir sayinin birler basamagi isteniyorsa %10 yapin..ilk rakami almak icin/ 1000 not eger sayim 5 basamakli ise /10000

        Scanner scan = new Scanner(System.in);
        System.out.println("4 basamakli bir sayi giriniz");
        int sayi =scan.nextInt();
        int sonRakam=sayi % 10;
        int ilkRakam=sayi /1000;
        System.out.println("Ilk rakam ve son rakam :"+ (ilkRakam+sonRakam));

 scan.close();

    }
}
