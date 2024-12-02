package switchstringmethods;

public class String01 {
    public static void main(String[] args) {

        //1.Character alma

        String s1 = "Study hard stay humble";

        System.out.println(s1.charAt(0));//S

        // 7. character ekrana yazdir

        System.out.println(s1.charAt(6));//h

        // son character ekrana yazdirin

        System.out.println(s1.charAt(s1.length() - 1));// son karakteri almak icin lenght alinir

        //ortadaki character ekrana yazin(burda bazen ozel durumlar oalabilir uzunluk bazen tek yada cift olma durumu


        if (s1.length()%2!=0) {

            System.out.println(s1.charAt((s1.length() - 1) / 2));


        }else {
            System.out.println("Orta character yok");
        }

      //2.concadination
        String s2 ="Ogreten ogrenir";
        System.out.println(s2.concat(" tammam mi?"));

      //3.contains(icermek) methodu boolean(true -false) return(uretmek) eder

        String s3="Java ogren zengin ol";
        System.out.println(s3.contains("J"));//true
        System.out.println(s3.contains("x"));//false
        System.out.println(s3.contains("ogren"));//true
        System.out.println(s3.contains("Zengin"));//false
        System.out.println(s3.contains(""));//true---hiclik stringde bir karakterdir..harflerin arasinda hicbirsey yok
        System.out.println(s3.contains(" "));//true


     //4.
        String s4="Cok calis is bul";



    }
}