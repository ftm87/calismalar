package typecasting;

public class Typecasting01 {
    public static void main(String[] args) {


    /*
    byte< short < int < long <float <double

     java kucuk data type lerini kolay is oldugundan bizim yardimimiza ihtiyac duymadan yapabilir
     bunun adi Auto Widening Casting (otomotik genisletme islemi) dir

     asagidaki gibi kucuk datayi buyuk dataya koyabiliriz

     */

   byte b1 = 12;
   short s1 =b1;
   int i1 = b1;
   float f1 = b1;


   /*
    byte< short < int < long <float <double

    burda ise buyuygu kucuge koymak istersek java bunu yapmak istemez riskli ve ona yardim etmeliyiz..

    biz bunu kod yaparak yapabilirz bunun adi Explicit Narrowing Casting ( acikca  daraltma isi)

    */

   short s2 =1210;
   byte b2 =(byte) s2;



    }
}
