package tearnary;

import java.util.Scanner;

public class Ternary03 {
    public static void main(String[] args) {
        /*  Kullanicidan  bir ucgenin uc kenar uzunlugunu alin eger
        iki kenar uzunlugu birbirine esit ise  ekrana " ikizkenar ucgen " yazdirin
        diger durumlarda " ikizkenar degil " yazdirin
*/


        Scanner scan=new Scanner(System.in) ;
        System.out.println("Lutfen ucgenin 3 kenar uzunlugunu giriniz");
        int k1 = scan.nextInt();
        int k2 = scan.nextInt();
        int k3 = scan.nextInt();


    String result =  k1==k2 || k1==k3 || k2==k3  ? " ikizkenar ucgen " : " ikizkenar degil ";
        System.out.println(result);


    }
}
