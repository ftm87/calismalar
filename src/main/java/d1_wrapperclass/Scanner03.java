package d1_wrapperclass;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Alfabeden bir harf secelim");
         // Kullanicidan aldigniz data type char ise asagidaki kodu kullaniniz

        char harf = scan.next().charAt(0);// bunun aciklamasi, charla (0) ilk gordugun karakteri al.burda biz harf istedigimiz icin 0 yazdik baska olsa idi diger rakamlarida yazabilirdik

        System.out.println(harf);// burda hangi harfi yazarsan onu yazr









    }
}
