package switchstringmethods;

public class String03 {
    public static void main(String[] args) {

       //15- substring()---bu method bize istenilen indexten sonrasini veriri(istenilen index dahil)

        //subsitring(0,1) bize ilk harfi verir,charAt(0) da ilk harfi veiri
        String s1 ="Java OOP languagedir";
        System.out.println(s1.substring(3));//a OOP languagedir
        System.out.println(s1.substring(5));// OOP languagedir
        System.out.println(s1.substring(s1.length()-1));//r
        System.out.println(s1.substring(5, 8));//OOP ----bunun gorevi ilk index dahil ikinci haric
        System.out.println(s1.substring(5, 5));//hicbirsey gelmez.
       // System.out.println(s1.substring(5, 2));//baslangic indexi bitis index inden buyuk olamaz .yoksa rub time error


        //16-trim()-- bir stringin bastaki ve sondaki spaceleri siler

        String s2 ="  Java ogerenen diger dilleri cabucak ogrenir  ";
        System.out.println(s2.trim());





    }
}
