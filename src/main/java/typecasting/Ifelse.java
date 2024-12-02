package typecasting;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {


     //  if rains      I will go to Mall        else  I will go to picnic
     //  true           buraya gider
      //  false                                       buraya gider

        Scanner input = new Scanner(System.in);
        System.out.println(" lutfen bir sayi giriniz");
        int a = input.nextInt();

       //1.yol

        if (a>=0){
            System.out.println("negatif degil");
        }else {
            System.out.println("negetiftir");
        }
        System.out.println("--------------------------");
       // 2.yol      burda iki condition var ve yorariz  ve yavaslatiriz javayi bunu cok kullanmayiz

        if (a>=0){
            System.out.println("negatif degil");
        }

        if (a<0){
            System.out.println("negetiftir");
        }


    }
}
