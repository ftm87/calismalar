package typecasting;

import java.util.Scanner;

public class IfElseif02 {
    public static void main(String[] args) {
        /*
        Kullanicidan  bir ucgenin uc kenar uzunlugunu alin eger
        uc kenar uzunlugu birbirine esit ise  ekrana " Eskenar ucgen " yazdirin
        sadece iki kenar uzunlugu birbirine esit ise ekrana " ikizkenar ucgen " yazdirin
        tum kenar uzunluklari birbirinden farkli ise  " Cesitkenar ucgen "yazdirin


         */


        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen ucgenin uc kenar uzunlugu giriniz");
        double k1 = scan.nextDouble();
        double k2 = scan.nextDouble();
        double k3 = scan.nextDouble();



        if (k1==k2 && k2==k3){
            System.out.println(" Eskenar ucgen ");
        } else if (k3 ==k2 || k2==k1 || k1==k3) {
            System.out.println(" ikizkenar ucgen ");
        }else if (!(k1==k2 && k2==k3)){
            System.out.println(" Cesitkenar ucgen ");
        }
      // en sonki else if kullanmayabilirdikte..sadece else  diyip calsitirsakda olur,ikisinde de calisir
      // not : uclu karsilastirma olmaz k1==k2==k3 sadce iki eleman
    }
}
