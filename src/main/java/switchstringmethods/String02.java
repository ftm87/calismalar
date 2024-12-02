package switchstringmethods;

public class String02 {
    public static void main(String[] args) {

        //4, endsWith() string ile calisir,char kabul etmez

        String s1 ="Testi al kendini gor";
        System.out.println(s1.endsWith("r"));//true
        System.out.println(s1.endsWith("gor"));//true
        System.out.println(s1.endsWith(""));//true



       //5.equals() iki string ifadenin esitligni kontrol eder .buyuk kucuk harfe duyarli

        System.out.println("Ali".equals("Ali"));//true
        System.out.println("Ali".equals("ALI"));//false

      //6.equalsIgnoreCase() buda buyuk kucuk harf demeden esitler

        System.out.println("Ali".equalsIgnoreCase("ali"));//true

        //7.indexOf()  methodu indexi sorulan char in
        // String icindeki ilk gorunumunun indexini return eder


        //indexOf()  methodu da hem char hemde String kullanilabilir
        //indexOf()  methodunda birden fazla karakter in indexi sorulursa ilk karakterin indexini alir

        System.out.println(s1.indexOf('i'));//4
        System.out.println(s1.indexOf('T'));//0
        System.out.println(s1.indexOf(' '));//5
        System.out.println(s1.indexOf("al"));//6 ilk karakterin indexi
        System.out.println(s1.indexOf('x'));//-1 olmayan charlar icin -1 return eder
        System.out.println(s1.indexOf(""));//0 bunu anlami hicbirsey ilk baktigimizda hiclik goruurz buyuzdebn 0


      //8.indexof fromindex

        String s2 ="Cabuk ogrenilen cabuk unutulur";
        System.out.println(s2.indexOf('a', 6));// 17  burdaki mana 6 . indexe git ordan sonraki karakterlerde 'a' hangi index te
        System.out.println(s2.indexOf('r', 8));//8 ilk gordugu r daki indexi verir
        System.out.println(s2.indexOf("buk", 5));//18


        //9.isEmpty() methodundan true aliyorsaniz o Stringin icinde hic bir karakter yok demektir.
        // yani Stringin lenghti o demektir
                                                      // "T e k r a r   e t   t  e  k  r  a  r     u n u t m a"
        String s3 = "Tekrar et tekrar unutma";         // 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17
        System.out.println(s3.isEmpty());//false
        System.out.println("".isEmpty());//true

        //10.lastIndexOf

        System.out.println(s3.lastIndexOf('e'));//11
        System.out.println(s3.lastIndexOf("rar"));//13
        System.out.println(s3.lastIndexOf('r', 16));//15

      //11.length() bir string teki karakterlerin  sayisini veririr

        System.out.println(s3.length());//23

      //12.replace() bir seyi al yerine koy methodu

        System.out.println(s3.replace('e', 'E'));//TEkrar Et tEkrar unutma
        System.out.println(s3.replace("krar", "miz"));//Temiz et temiz unutma
        System.out.println(s3.replace("a", ""));//Tekrr et tekrr unutm
        System.out.println(s3.replace(" ", ""));//Tekrarettekrarunutma

      //13.Regular expression (regex) :belli turdeki karakterleri secmemize yarar

        // -----------.\\d==> tumrakamlar.
        // ------------\\D==> tum rakam disi karakter.
        //-------------\\w==> A-->Z   a-->z  0-->9


        String s4 ="Code1 yazarak2 ogrenilir3";
        System.out.println(s4.replaceAll("\\d", "*"));//Code* yazarak* ogrenilir*
        System.out.println(s4.replaceAll("\\D", "*"));//****1********2**********3
        System.out.println(s4.replaceAll("\\w","*"));//

     //14.startsWith() burda char kullanamazssin string kullanilmali

        System.out.println(s4.startsWith("C"));//true
        System.out.println(s4.startsWith("c"));//false
        System.out.println(s4.startsWith("Code"));//true

      //ornek;s4 Stringinin 4.(index 3 )karakteri "e" mi?
        System.out.println(s4.startsWith("e",3));//true

   


    }


}
