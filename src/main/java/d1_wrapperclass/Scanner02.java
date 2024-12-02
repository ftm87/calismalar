package d1_wrapperclass;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        // data tipi string oldugu zaman nextline  methodunu secmeliyiz.
        // ayrica data type string oldugu zaman next() methoduda kullanilir
        // ama next methodu sadece iki kelimyi alir devamini almaz nextline hepsini alir


        Scanner scan = new Scanner(System.in);

        System.out.println("Isminizi giriniz");

        String name = scan.nextLine();

        System.out.println(name);






    }
}
