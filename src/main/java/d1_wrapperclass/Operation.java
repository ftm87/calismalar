package d1_wrapperclass;

public class Operation {
    public static void main(String[] args) {


       // ornekler


      // not ; charlari int data type' inde   bir variable atarsaniz
        // java o charin ASCII degerini variable icine koyar



       int harf ='a';
        System.out.println(harf);//97

      int unlem = '!';
        System.out.println(unlem);//33 burdaki data tipini byte kullanabiliriz

        // java matematikteki tum islemleri dogru yapar

        int a =10;
        int b =36;
        int c =12;
        System.out.println(a+b);//46
        System.out.println(c/a);//1    burda aslinda 1,2 olaliydi ama int oldugu iicin sonucu int veriyor.
        System.out.println(b+a*c);//156

      //---------------------------------
      // farkli data type 'leri ile matematiksel islemler yaparsaniz sonuc buyuk data tipinde verilir

      // byte < short < int < long < float < double

        int d =12;
        double e =4;
        float f =4f;
        System.out.println(d/e);//3,0
        System.out.println(e/d);//0.3333333333333333    burda double nin ne kadar buyuk oldugunu goruyoruz
        System.out.println(f/d);//0.33333334

        //-------------------------------

        // modulus islemi (%) iki ondalik olmayan sayinin birbirine bolundugunde kalani vermesi

        System.out.println(13%5);//3
        System.out.println(245%3);//2


        // Cift (even) sayi 2 e bolundugunde kalani 0
        // tek (odd) sayi 2 e bol kalan 1

        System.out.println(1252353%2);//1 burda  yazdigim sayinin tekmi cift mi oldugu anlamak icin bunu yaptik..yani sayimiz tek

       // Concatenation;stringleri birlestirmek icin kullanilir sembolu '+'

       String s1 = "Java";
       String s2 = "kolaydir";

      System.out.println(s1+" " +s2);//Java kolaydir

      int g = 2;
      int h = 3;
      String i = "Java";
      System.out.println(i + g + h);//Java23
      System.out.println(i +(g+h));//Java5
      System.out.println(g+h+i);//5Java  .....java yukardan asagi sagdan sola gider

     // bu veriable lari kullanarak 61Java-1 yazalim
      System.out.println((g*h)+""+(h-g)+i+(g-h));//61Java-1



    }
}
